package advancedJava.threads;

import java.util.concurrent.Semaphore;

public class Semaphore01 {
    //creates a limited number of threads and replaces the completed one
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        Thread.sleep(2000);

        System.out.println("3 checkouts available");

        Customer customer1 = new Customer("cst1",semaphore);
        customer1.start();
        Customer customer2 = new Customer("cst2",semaphore);
        customer2.start();
        Customer customer3 = new Customer("cst3",semaphore);
        customer3.start();
        Customer customer4 = new Customer("cst4",semaphore);
        customer4.start();
        Customer customer5 = new Customer("cst5",semaphore);
        customer5.start();
    }
}

class Customer extends Thread {
    private String name;
    Semaphore semaphore;

    public Customer(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting");
            semaphore.acquire(); // waiting in line
            System.out.println(name + " on checkout");

            // process time 3 min
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " at checkout for " + i + "min(s)");
                Thread.sleep(5000);
            }
            System.out.println(name + " completed payment");
            semaphore.release(); // completed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}