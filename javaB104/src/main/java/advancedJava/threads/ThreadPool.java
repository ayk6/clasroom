package advancedJava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // ThreadPool w 2 threads
        // Used to limit how many threads to run at the same time

        ThreadCreator threadCreator1 = new ThreadCreator("thread1");
        ThreadCreator threadCreator2 = new ThreadCreator("thread2");
        ThreadCreator threadCreator3 = new ThreadCreator("thread3");
        ThreadCreator threadCreator4 = new ThreadCreator("thread4");
        ThreadCreator threadCreator5 = new ThreadCreator("thread5");
        ThreadCreator threadCreator6 = new ThreadCreator("thread6");
        ThreadCreator threadCreator7 = new ThreadCreator("thread7");
        ThreadCreator threadCreator8 = new ThreadCreator("thread8");

//        threadCreator1.start();
//        threadCreator2.start();
//        threadCreator3.start();
//        threadCreator4.start();
//        threadCreator5.start();
//        threadCreator6.start();
//        threadCreator7.start();
//        threadCreator8.start();

        executorService.execute(threadCreator1);
        executorService.execute(threadCreator2);
        executorService.execute(threadCreator3);
        executorService.execute(threadCreator4);
        executorService.execute(threadCreator5);
        executorService.execute(threadCreator6);
        executorService.execute(threadCreator7);
        executorService.execute(threadCreator8);

        executorService.shutdown();
    }
}

class ThreadCreator extends Thread{
    private String threadName;

    public ThreadCreator(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName+" stopped");
    }
}
