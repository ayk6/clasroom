package advancedJava.threads;

public class MultiThread04 {
    public static void main(String[] args) throws InterruptedException {
        Brackets2 brackets2 = new Brackets2();
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
              for (int i = 1; i<=10;i++){
                  brackets2.generateBrackets();
              }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<=10;i++){
                    brackets2.generateBrackets();
                }
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
class Brackets2{
    public void generateBrackets(){
      synchronized (this){
          for (int i =0;i<10;i++){
              if (i<5) System.out.print("[");
              else System.out.print("]");
          }
          System.out.println();
      }
        for (int i =1; i<=5;i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}