package day18;

import java.util.Scanner;

public class whileLoopVsForLoop {
    public static void main(String[] args) {
        //kullanıcıdan sayı al, 0 girene kadar topla, 0 girince toplamı yazdır
        // başlangıç ve bitiş değerleri net değilse whileLoop daka kullanışlı
        Scanner scan = new Scanner(System.in);


        int num = 1;
        int result = 0;

        while (num!=0){
            System.out.print("toplanmasını istediğiniz sayıyı girin : ");
            num = scan.nextInt();
            result+=num;
        }
        System.out.println("girilen sayılar toplamı : "+result);



    }
}
