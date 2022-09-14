package javaLess.day40;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz sayıyı yazın");
        int num = scan.nextInt();

        System.out.println("Böleni yazın");
        int num2 = scan.nextInt();

        // System.out.println("Sonuç : "+(num/num2));
        // 0'a böldüğümüzde Exception verir
        // Exception devamında hatalı class'ı, methodu ve satırı verir
        // burada sorunu if ile çözebiliriz

        if (num2 ==0) {
            System.out.println("tanımsız");
        }
        else System.out.println("Sonuç : "+(num/num2));
    }
}
