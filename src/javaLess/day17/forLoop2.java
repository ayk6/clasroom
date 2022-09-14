package javaLess.day17;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {

        //kullanıcıdan tam sayı iste 0<tamsayi<100
        //1'den başlayarak sayıya kadar üçe bölünenleri yazdır
        Scanner scan = new Scanner(System.in);
        System.out.print("0 ile 100 arasında tam sayı girin : ");
        int num = scan.nextInt();
        if (num<1||num>99) {
            System.out.println("hatalı giriş");
        }
        else {
            for (int i=1; i<=num; i++) {
                if (i%3==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
