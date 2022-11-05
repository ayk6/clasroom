package practiceJava.overridingProject;

public class Teacher extends BaseCreditManager{
    @Override
    protected void calculate(int a) {
        System.out.println("öğretmen kredi geri ödeme tutarı = "+ String.format("%1$,.2f",a*1.18)+" €");
    }
}
