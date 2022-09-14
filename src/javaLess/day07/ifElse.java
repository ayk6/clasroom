package javaLess.day07;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //if else yazılınca if çalışmazsa else kontrol edilmeden çalışır
        //if eğer, else değilse
        //iki ihitmal varsa kullanılır, daha fazla ihtimal olursa yanlış sonuç verebilir

        Scanner scan= new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdiğiniz sayı çift");
        }
         else {System.out.println("girdiğiniz sayı tek");
         }
    }


}


