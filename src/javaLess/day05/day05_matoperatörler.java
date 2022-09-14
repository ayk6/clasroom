package javaLess.day05;

import java.util.Scanner;

public class day05_matoperatörler {
    public static void main(String[] args) {
        //modulus (%) işlemi bölmede kalanı verir
        int a=44 % 5; // bölmede kalanı verir (4)
        System.out.println(a); //4
        //örn sayı % 2; 0 ise çift, 1 ise tek
        //bölünebilme işlemlerinde modulus (%) kullanılabilir
        // sayı%10; yaparsak son basamağı buluruz

        //örn
        // 4 basamaklı sayının basamakları toplamı

        Scanner scan= new Scanner(System.in);
        System.out.println("4 basamaklı tam sayı giriniz");
        int dortbasmsayi=scan.nextInt(); //3579
        int rakam;
        int rakamlartoplamı=0;

         rakam=dortbasmsayi%10; //son basamağı bulduk 9
        rakamlartoplamı+=rakam; // 9 oldu

        dortbasmsayi/=10; //son basamağı attı 357
        rakam=dortbasmsayi%10; // son basamağı aldı 7
        rakamlartoplamı+=rakam; // 16 oldu

        dortbasmsayi/=10; //son basağı attı 35
        rakam=dortbasmsayi%10; // son basamağı aldı 5
        rakamlartoplamı+=rakam; //21 oldu

        dortbasmsayi/=10; //son basamağı attı 7
        rakam=dortbasmsayi%10; //son basamağı aldı 3
        rakamlartoplamı+=rakam ; //24 oldu

        System.out.println("4 basamaklı sayınız rakamları toplamı : "+ rakamlartoplamı);











    }
}
