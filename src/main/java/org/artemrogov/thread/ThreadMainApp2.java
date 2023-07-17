package org.artemrogov.thread;


class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0;
        for (int i =0; i<nums.length; i++){
            sum+=nums[i];
            System.out.println("Current sum: " + Thread.currentThread().getName() + " sum:"+ sum);
        }
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
      return sum;
    }
}

class MyThreadTestSum implements Runnable {
    String name;

    Thread thread;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    public MyThreadTestSum(String name, int[] nums) {
        thread = new Thread(this,name);
        this.name = name;
        this.a = nums;
        thread.start();
    }

    @Override
    public void run() {
       int sum;
       answer = sa.sumArray(a);
       System.out.println("SUM: " +thread.getName() + " :" + answer);
    }
}
public class ThreadMainApp2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        MyThreadTestSum myThreadTestSum1 = new MyThreadTestSum("Test Thread 1",arr);
        MyThreadTestSum myThreadTestSum2 = new MyThreadTestSum("Test Thread 2",arr);
    }
}
