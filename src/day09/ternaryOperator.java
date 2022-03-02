package day09;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {

        /*if(condition) {code1} else {code2}
        condition? code1: code2 şeklinde de yazılabilir
        condition true ise code1 değilse code2 çalışır
        örn: sayi%2==0 ? "çift";"tek"
        örn: sayi<10 ? sayi*2 : sayi+5
         */

        //kullanıcıdan tam sayı alıp tek ya da çift yazdıralım
        Scanner scan = new Scanner(System.in);
        System.out.println("Tam sayı girin");
        int sayi=scan.nextInt();
        System.out.println(sayi%2==0? "girilen sayı çift" : "girilen sayı tek");


    }
}
