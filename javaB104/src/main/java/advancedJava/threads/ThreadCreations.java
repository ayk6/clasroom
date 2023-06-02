package advancedJava.threads;

public class ThreadCreations {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.run(); // method works but not thread
        thread1.start(); // thread works and then run works

        MyRunnable myRunnable1 = new MyRunnable();
        myRunnable1.run();
        Thread thread2 = new Thread(myRunnable1); // now runnable is thread
        thread2.start();

        // 3rd way : anonymous thread
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println("anonymous thread");
            }
        });
        thread3.setName("thread3");
        thread3.start();

        // 4th way
        Thread thread4 = new Thread(()->{
            System.out.println("lambda thread4");
        });
        thread4.start();

        System.out.println("main method ends");

        // 5th way
        Thread thread5 = new Thread(()->{
            System.out.println("lambda thread5");
        });
        thread5.start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("myThread class is working");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("myRunnable class is working");
    }
}
