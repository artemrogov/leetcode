package org.artemrogov.thread;


class MyThread implements Runnable{

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
       try{
           for (int count = 0; count<10; count++){
               Thread.sleep(1000);
               System.out.println(getName() + " count: " + count);
           }
       }catch (InterruptedException e){
           System.out.println("прерван " + e.getMessage());
       }
    }

    private String getName(){
        return this.name;
    }
}


class MyThread2 implements Runnable{

    private final String name;

    public MyThread2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try{
            for (int count = 0; count<10; count++){
                Thread.sleep(1000);
                System.out.println(getName() + " count: " + count);
            }
        }catch (InterruptedException e){
            System.out.println("прерван " + e.getMessage());
        }
    }

    private String getName(){
        return this.name;
    }
}
public class ThreadMainApp {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("Test Thread 01");
        Thread thread = new Thread(myThread);
        thread.start();
        thread.join();
        MyThread2 myThread2 = new MyThread2("My Thread - 2");
        Thread thread1 = new Thread(myThread2);
        thread1.start();
    }
}
