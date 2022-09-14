package javaLess.day40;

import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int ctrl=0;
    while (ctrl !=2) {
        System.out.println("Bölmek istediğiniz sayıyı yazın : ");
        int num = scan.nextInt();

        System.out.println("Böleni yazın : ");
        int num2 = scan.nextInt();

        try {
            System.out.println("Sonuç : "+ (num/num2));
        } catch (Exception e) {
            e.printStackTrace(); // hata verdi ama kod çalışmaya devam etti
            // hata çıktısını değiştirebiliriz
        }

        System.out.println("Devam etmek için 1, Sonlandırmak için 2 : ");
        ctrl=scan.nextInt();

    }
    }
}
