package javaLess.day14;

import java.util.Locale;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        Scanner scan = new Scanner(System.in);
        System.out.print("isim : ");
        String name = scan.nextLine();
        System.out.print("soyisim : ");
        String surname = scan.nextLine();
        System.out.print("kart no : ");
        String num = scan.nextLine();

        System.out.print(name.substring(0,1).toUpperCase()+
                name.substring(1).replaceAll("\\w","*")+" ");

        System.out.println(surname.substring(0,1).toUpperCase()+
                surname.substring(1).replaceAll("\\w","*"));

        System.out.println(("**** **** **** ")+num.substring(12));




    }
}
