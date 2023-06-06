package advancedJava.threads;

import java.util.concurrent.CountDownLatch;

public class CountdownLatch01 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        // used to prioritize
        // gives priority to given number of threads

        WorkerThreads wt1 = new WorkerThreads("wt1", 3000,countDownLatch);
        WorkerThreads wt2 = new WorkerThreads("wt2", 5000,countDownLatch);
        WorkerThreads wt3 = new WorkerThreads("wt3", 7000,countDownLatch);

        wt1.start();
        wt2.start();
        wt3.start();

        try {
            countDownLatch.await();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+ " ended");

    }
}

class WorkerThreads extends Thread{
    private int delay;
    private CountDownLatch countDownLatch;

    @Override
    public void run() {
        try {
            Thread.sleep( delay);
            System.out.println(Thread.currentThread().getName()+ " working");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WorkerThreads(String name , int delay, CountDownLatch countDownLatch) {
        super(name);
        this.delay = delay;
        this.countDownLatch = countDownLatch;
    }
}
