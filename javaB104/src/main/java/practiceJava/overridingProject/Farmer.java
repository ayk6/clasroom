package practiceJava.overridingProject;

import java.util.Scanner;

public class Farmer extends BaseCreditManager {

    public Farmer() {
        super(0);
        System.out.println("tarım kredisi");
    }

    @Override
    protected void calculate() {
        Scanner scan= new Scanner(System.in);
        System.out.print("kredi tutarı(€) : ");
        int credit = scan.nextInt();
        System.out.println("tarım kredi geri ödeme tutarı = "+ String.format("%1$,.2f",credit*1.18)+" €");
    }
}
