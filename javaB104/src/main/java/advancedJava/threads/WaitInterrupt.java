package advancedJava.threads;

public class WaitInterrupt {
    public static int balance = 0;

    public static void main(String[] args) {
        WaitInterrupt waitInterrupt = new WaitInterrupt();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitInterrupt.withdraw(400);
            }
        });
        thread1.setName("withdraw threat");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                waitInterrupt.deposit(1000);
                thread1.interrupt(); // thread2 killing thread1
            }
        });
        thread2.setName("deposit threat");
        thread2.start();

    }

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                System.out.println("waiting...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("waiting process ended");;
                }
            }
        }
        balance -= amount;
        System.out.println("withdrawal completed");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("deposit completed");
    }
}


