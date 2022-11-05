package practiceJava.overridingProject;


import java.util.Scanner;

public class BaseCreditManager {

    public BaseCreditManager() {
        System.out.println("kredi başvurusu alındı");
    }

    protected void calculate(){

        Scanner scan= new Scanner(System.in);
        System.out.println("kredi tutarı : ");
        int credit = scan.nextInt();
        System.out.println("kredi geri ödeme tutarı = "+ credit*1.18);
        }
}
