package practiceJava.overridingProject;

import java.util.Scanner;

public class BaseCreditManager {

    public BaseCreditManager(int a) {
        System.out.print("kredi türü seçildi : ");
    }

    public BaseCreditManager() {
        System.out.println("kredi başvurusu alındı");
    }

    protected void creditType() throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("öğrenci-1 , öğretmen-2 , tarım-3 , diğer-4\nkredi türü : ");
        int creditType = scan.nextInt();

        if (creditType < 1 || creditType > 3) {
            throw new Exception("kredi hakkı bulunmamaktadır.");
        }

        switch (creditType) {
            case 1:
                Student std = new Student();
                std.calculate();
                break;
            case 2:
                Teacher tch = new Teacher();
                tch.calculate();
                break;
            case 3:
                Farmer frm = new Farmer();
                frm.calculate();
                break;
        }
    }

    protected void calculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kredi tutarı : ");
        int credit = scan.nextInt();
        System.out.println("kredi geri ödeme tutarı = " + credit * 1.18);
    }
}
