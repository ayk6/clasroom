package practiceJava.overridingProject;

public class Farmer extends BaseCreditManager {
    @Override
    protected void calculate(int a) {
        System.out.println("tarım kredi geri ödeme tutarı = "+ String.format("%1$,.2f",a*1.18)+" €");
    }
}
