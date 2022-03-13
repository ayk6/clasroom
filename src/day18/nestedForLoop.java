package day18;

import java.util.Scanner;

public class nestedForLoop {
    public static void main(String[] args) {
        //kullanıcıdan rakam al
        //çarpım tablosu oluştur

        Scanner scan = new Scanner(System.in);
        System.out.print("bir rakam girin : ");
        int num = scan.nextInt();

        for (int i = 1 ; i <= num; i++) {
            for (int j = 1 ; j <= num; j++) {

                System.out.print(i+"*"+ j+ "=" +(i*j)+" ");
            }
            System.out.println("");// ikinci loop a geçmeden satır atlaması için
        }


    }
}
