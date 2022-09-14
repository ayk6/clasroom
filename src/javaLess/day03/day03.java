package javaLess.day03;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        //scan ilk harf alma
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi Yazınız");

        char firstLetter= scan.next().charAt(0);
        //charAt(index) method'u ilk harfi alır
        //String index sıfırdan başlar, ikinci harf 1. index olur

        System.out.println("İsminizin İlk Harfi : " + firstLetter);
    }
}
