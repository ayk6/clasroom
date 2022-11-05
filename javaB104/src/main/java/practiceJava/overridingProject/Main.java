package practiceJava.overridingProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("öğrenci-1 , öğretmen-2 , tarım-3 , diğer-4\nkredi türü : ");
        int creditType = scan.nextInt();

        if (creditType<1||creditType>3){
            throw new Exception("kredi hakkı bulunmamaktadır.");
        }

        BaseCreditManager bcm;

        switch (creditType) {
            case 1:
                bcm = new Student();
                bcm.calculate();
                break;
            case 2:
                bcm = new Teacher();
                bcm.calculate();
                break;
            case 3:
                bcm = new Farmer();
                bcm.calculate();
                break;
        }
    }
}
