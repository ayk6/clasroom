package day08;

import java.util.Scanner;

public class sayiKontrol {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı iste, ikisi de pozitif ise topla
        // ikisi de negatifse çarp, sıfır varsa yutan elaman yazdır
        // artı ve eksi varsa farklı işaret varsa işlem yapamaz yazdır
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı girin");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();
        if (num1>0 && num2>0){
            System.out.println("Girilen pozitif sayılar toplamı = "+(num1+num2));}
        else if (num1<0 && num2<0){
            System.out.println("Girilen negatif sayılar çarpımı = "+(num1*num2));}
        else if (num1==0 || num2==0){
            System.out.println("Sıfır yutan elemandır");}
        else System.out.println("Girilen sayılarla işlem yapamazsınız");


    }
}
