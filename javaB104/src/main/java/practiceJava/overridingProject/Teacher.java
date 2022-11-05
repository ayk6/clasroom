package practiceJava.overridingProject;

import java.util.Scanner;

public class Teacher extends BaseCreditManager{

    public Teacher(){
        super(0);
        System.out.println("öğretmen kredisi");
    }

    @Override
    protected void calculate() {
        Scanner scan= new Scanner(System.in);
        System.out.print("kredi tutarı(€) : ");
        int credit = scan.nextInt();
        System.out.println("öğretmen kredi geri ödeme tutarı = "+ String.format("%1$,.2f",credit*1.18)+" €");
    }
}
