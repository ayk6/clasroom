package advancedJava.threads;

public class DeadLockDemo {
    public static void main(String[] args) {
        // If different treads try to access each other's data,
        // the code will not progress. - Dead Lock

        final String lock1 = "lock1";
        final String lock2 = "lock2";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("thread1 locked lock1 variable");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("thread1 locked lock2 variable");
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("thread2 locked lock1 variable");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("thread2 locked lock2 variable");
                    }
                }
            }
        });
        thread2.start();
    }
}
