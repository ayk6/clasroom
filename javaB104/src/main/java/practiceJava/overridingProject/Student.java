package practiceJava.overridingProject;


import java.text.DecimalFormat;

public class Student extends BaseCreditManager{

    @Override
    protected void calculate(int a) {
        System.out.println("öğrenci kredi geri ödeme tutarı = "+ String.format("%1$,.2f",a*1.1)+" €");
    }
}
