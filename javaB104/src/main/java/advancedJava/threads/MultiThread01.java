package advancedJava.threads;

public class MultiThread01 {
    public static void main(String[] args) throws InterruptedException {
        BasicCounter basicCounter = new BasicCounter(1);
        BasicCounter basicCounter2 = new BasicCounter(2);
        basicCounter.count();
        System.out.println("------------");
        basicCounter2.count();

        System.out.println("counter w thread");
        MultiThreadCounter multiThreadCounter = new MultiThreadCounter(1);
        MultiThreadCounter multiThreadCounter2 = new MultiThreadCounter(2);
        multiThreadCounter.start();
        System.out.println("-------------");
        multiThreadCounter2.start();
        multiThreadCounter.join(); // wait for end
        multiThreadCounter2.join(); // wait for end
        System.out.println("end");
    }
}

class BasicCounter{
    private int num;

    public BasicCounter(int num) {
        this.num = num;
    }

    public void count() throws InterruptedException {
        for (int i =1; i<=10;i++){
            Thread.sleep(100);
            System.out.println("i"+i+" = "+ num);
        }
    }
}

class MultiThreadCounter extends Thread{
    private int threadNum;

    public MultiThreadCounter(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void countMe() throws InterruptedException {
        for (int i =1; i<=10;i++){
            Thread.sleep(100);
            System.out.println("i"+i+" = "+ threadNum);
        }
    }
}
