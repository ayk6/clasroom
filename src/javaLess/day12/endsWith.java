package javaLess.day12;

import java.util.Scanner;

public class endsWith {
    public static void main(String[] args) {
        //String veri istenen karakter(ler) ile bitiyorsa TRUE
        //bitmiyorsa FALSE ,  sadece String ister

        // kullanıcıdan mail adresi al, @gmail.com yoksa geçersiz,
        // varsa ve @gmail.com ile bitiyorsa geçerli
        // varsa ama @gmail.com ile bitmiyorsa kontrol edin

        System.out.println("gmail adresi yazın");
        Scanner scan = new Scanner(System.in);
        String gmail = scan.next();

        //!gmail.contains("@gmail.com") == içermiyorsa
        if (!gmail.contains("@gmail.com")) {
            System.out.println("geçersiz");}
        else if (gmail.endsWith("@gmail.com")){
            System.out.println("geçerli");}
        else System.out.println("kontrol");
    }
}
