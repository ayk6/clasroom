package day07;

import java.util.Locale;
import java.util.Scanner;

public class ifElseIf_ {
    public static void main(String[] args) {
        //if else if ...... ikiden fazla ihtimal olduğunda
        Scanner scan = new Scanner(System.in);
        System.out.println("gün ismi yazınız");
        String gunIsmi= scan.next().toLowerCase(Locale.ROOT);

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("yazdığınız gün hafta sonu");}
        else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")||gunIsmi.equals("çarşamba") ||
                gunIsmi.equals("perşembe" ) || gunIsmi.equals("cuma"))
            System.out.println("yazdığınız gün hafta içi");
        else System.out.println("hatalı giriş");

        //3. ihtimal ekledik

    }
}
