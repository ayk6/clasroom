
package advancedPrac.day02;

import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        /*kullanıcıdan vize final notları al
        vize40%, final 60% olarak hesapla ve harf notuna çevir
        90-100 AA, 80-90 BB, 70-80 CB, 60-70 CC,50-60 DC, 40-50 DD,
        0-40 FF        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Vize notunu yazın : ");
        double vize = scan.nextDouble();
        System.out.print("Final notunu yazın : ");
        double finalnot = scan.nextDouble();
        double gradeort = (vize * 0.4) + (finalnot * 0.6);


        if (vize < 0 || vize > 100 || finalnot < 0 || finalnot > 100) {
            System.out.println("geçerli not girin");
        }
        else {
            System.out.println("Not ortalaması : " + gradeort);
            if (gradeort >= 90) {
                System.out.println("Harf notu : AA");
            } else if (gradeort >= 80) {
                System.out.println("Harf notu : BB");
            } else if (gradeort >= 70) {
                System.out.println("Harf notu : CB");
            } else if (gradeort >= 60) {
                System.out.println("Harf notu : CC");
            } else if (gradeort >= 50) {
                System.out.println("Harf notu : DC");
            } else if (gradeort >= 40) {
                System.out.println("Harf notu : DD");
            } else System.out.println("Harf notu : FF");

        }
    }
}
