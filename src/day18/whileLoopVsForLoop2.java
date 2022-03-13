package day18;

import java.util.Scanner;

public class whileLoopVsForLoop2 {
    public static void main(String[] args) {
        //kullanıcıdan sayı al, toplamları 500'ü geçince toplamı yazdır
        // başlangıç ve bitiş değerleri net değilse whileLoop daka kullanışlı

        Scanner scan = new Scanner(System.in);


        int num = 0;
        int result = 0;

        while (result<=500){
            System.out.print("toplanmasını istediğiniz sayıyı girin : ");
            num = scan.nextInt();
            result+=num;
        }
        System.out.println("girilen sayılar toplamı 500'ü geçti - toplam : "+result);
    }
}
