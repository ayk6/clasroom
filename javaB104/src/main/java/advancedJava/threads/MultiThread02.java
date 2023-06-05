package advancedJava.threads;

public class MultiThread02 {
    // synchronized allows only one thread
    public static int counter =0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread 1 is working");
            }
        });
        thread1.start();
        // thread1.join();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread 2 is working");
            }
        });
        thread2.start();
    }
}
class Counter {
    public synchronized static void count(){
        for (int i = 0; i<1000;i++){
            MultiThread02.counter++;
        }
        System.out.println(MultiThread02.counter);

        // synchronized allows only one thread
    }
}
