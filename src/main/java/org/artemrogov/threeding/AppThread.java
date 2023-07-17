package org.artemrogov.threeding;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class AppThread {
    public static void main(String[] args) {
        ExecutorService executorService01 = Executors.newFixedThreadPool(2);
        Map<String,String>map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        executorService01.submit(()->{
             lock.writeLock().lock();
             try{
                 sleep(1);
                 map.put("foo","bar");
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             } finally {
                 lock.writeLock().lock();
             }
        });

        Runnable readTask = ()->{
            lock.readLock().lock();
            System.out.println(map.get("foo"));
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.readLock().unlock();
            }
        };

        executorService01.submit(readTask);
        executorService01.submit(readTask);
    }
}
