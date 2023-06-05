package advancedJava.threads;

public class Volatile {
    volatile public static int flag =0; // can only operate on ram - volatile

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (flag==0){
                        System.out.println("thread1 is working");
                    }
                    else break;
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag =1;
                System.out.println("flag value is 1");
            }
        });
        thread2.start();
    }
}
