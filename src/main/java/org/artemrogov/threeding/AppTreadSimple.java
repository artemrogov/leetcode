package org.artemrogov.threeding;

import java.util.concurrent.locks.ReentrantLock;

public class AppTreadSimple {

    ReentrantLock lock = new ReentrantLock();

    int count = 0;

    void increment(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {

    }
}
