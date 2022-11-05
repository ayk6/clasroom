package practiceJava.overridingProject;

import java.util.Scanner;

public class Student extends BaseCreditManager{
    public Student() {
        System.out.println("kredi türü :  öğrenci kredisi");
    }

    @Override
    protected void calculate() {
        Scanner scan= new Scanner(System.in);
        System.out.print("kredi tutarı(€) : ");
        int credit = scan.nextInt();
        System.out.println("öğrenci kredi geri ödeme tutarı = "+ String.format("%1$,.2f",credit*1.1)+" €");
    }
}
