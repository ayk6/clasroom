package day12;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {
        //String veri istenen karakter(ler)i içeriyorsa TRUE
        //içermiyorsa FALSE ,  sadece String ister

        // kullanıcıdan mail adresi al, @gmail.com yoksa geçersiz,
        // varsa ve @gmail.com ile bitiyorsa geçerli
        // varsa ama @gmail.com ile bitmiyorsa kontrol edin

        System.out.println("gmail adresi yazın");
        Scanner scan = new Scanner(System.in);
        String gmail = scan.next();

        //!gmail.contains("@gmail.com") == içermiyorsa
        if (!gmail.contains("@gmail.com")) {
            System.out.println("geçersiz");
        } else if (gmail.lastIndexOf("@gmail.com") == (gmail.length() - 10)) {
            System.out.println("geçerli");
        } else System.out.println("kontrol");


    }
}