package javaLess.day07;

import java.util.Locale;
import java.util.Scanner;

public class ifDeneme2 {
    public static void main(String[] args) {
        // gün alıp hafta içi ya da hafta sonu yazdır
        Scanner scan = new Scanner(System.in);
        System.out.println("gün ismi yazınız");
        String gunIsmi= scan.next().toLowerCase(Locale.ROOT);

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("yazdığınız gün hafta sonu");}

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")||gunIsmi.equals("çarşamba") ||
                gunIsmi.equals("perşembe" ) || gunIsmi.equals("cuma"));
        System.out.println("yazdığınız gün hafta içi");

        // string ifadelerde == yerine equals kullanılır
    }
}
