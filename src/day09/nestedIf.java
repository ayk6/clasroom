package day09;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dört basamaklı tam sayı girin");
        int sayi = scan.nextInt();
        if (sayi<1000||sayi>9999){
            System.out.println("Hatalı giriş - Dört basamaklı tam sayı girmelisiniz");}
        else if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5’e bölünen çift sayı");}
            else {System.out.println("5’e bölünen tek sayı");}
        }
        else System.out.println("girilen sayı 5'e bölünmüyor");

    }
}
