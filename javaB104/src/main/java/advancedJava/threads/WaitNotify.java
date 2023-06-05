package advancedJava.threads;

public class WaitNotify {
    // wait() waits for notify
    public static int balance = 0;

    public static void main(String[] args) {
        WaitNotify waitNotify = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.withdraw(400);
            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                waitNotify.deposit(500);
            }
        });
        thread2.setName("Deposit Thread");
        thread2.start();
    }
    public void withdraw (int amount){
        synchronized (this){
            if (balance<=0){
                System.out.println("waiting for balance in account");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = balance-amount;
        System.out.println("Withdrawal completed");
    }
    public void deposit (int amount) {
        balance = balance+amount;
        System.out.println("deposit is complete");
        synchronized (this){
            notify();
        }
    }
}
