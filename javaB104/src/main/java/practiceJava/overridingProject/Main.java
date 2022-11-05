package practiceJava.overridingProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("öğrenci-1 , öğretmen-2 , tarım-3 , diğer-4");
        System.out.print("kredi türü : ");
        int creditType = scan.nextInt();

        if (creditType<1||creditType>3){
            throw new Exception("kredi hakkı bulunmamaktadır.");
        }

        System.out.print("kredi tutarı(€) : ");
        int credit = scan.nextInt();

        BaseCreditManager bcm;

        switch (creditType) {
            case 1:
                bcm = new Student();
                bcm.calculate(credit);
                break;
            case 2:
                bcm = new Teacher();
                bcm.calculate(credit);
                break;
            case 3:
                bcm = new Farmer();
                bcm.calculate(credit);
                break;
        }
    }
}
