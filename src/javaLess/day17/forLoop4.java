package javaLess.day17;

import java.util.Scanner;

public class forLoop4 {
    public static void main(String[] args) {
        //kullanıcıdan 100'den küçük tamsayı iste
        //tüm sayıları yazdır ama
        // %3==0 ise a, 5%==0 ise b, ikisi de ise c yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("0 ile 100 arasında tam sayı girin : ");
        int num = scan.nextInt();
        if (num < 1 || num > 99) {
            System.out.println("hatalı giriş");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 15 == 0) {
                    System.out.print("c ");}
                else if (i % 3 == 0) {
                        System.out.print("a ");}
                else if (i % 5 == 0){
                    System.out.print("b ");}
                else System.out.print(i+" ");
            }
        }
    }
}