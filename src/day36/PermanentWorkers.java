package day36;

public class PermanentWorkers extends Employee{
    public static void main(String[] args) {
        PermanentWorkers pw1 = new PermanentWorkers();
        pw1.stnum=5001;
        pw1.name="Vedat";
        pw1.surName="Spartaküs";
        pw1.status="worker";
        pw1.hrWage=30;
        pw1.accountWage();
        pw1.toString();
        System.out.println(pw1);


    }
}
