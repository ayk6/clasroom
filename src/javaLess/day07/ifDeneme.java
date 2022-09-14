package javaLess.day07;

import java.util.Scanner;

public class ifDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayi=scan.nextInt();
        if (sayi % 2 ==0 ) {
        System.out.println("girilen sayı çift sayıdır");}
        if (sayi % 2 !=0 ){
        System.out.println("girilen sayı çift sayı değildir");}

    }
}
