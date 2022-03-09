package day14;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        System.out.print("şifre girin : ");
        Scanner scan = new Scanner(System.in);
        String password=scan.nextLine();

        boolean firstLetter=false;
        if (password.charAt(0)>='A'&&password.charAt(0)<='Z')
        {firstLetter=true;}
        else System.out.println("Şifrenin ilk harfi büyük olmalı");

        boolean lastLetter=false;
        if (password.charAt(password.length()-1)>='a'&&
                password.charAt(password.length()-1)<='z')
        {lastLetter=true;}
        else System.out.println("Şifrenin son harfi küçük olmalı");

        boolean space=false;
        if (!password.contains(" "))
        {space=true;}
        else System.out.println("Şifre boşluk (\" \") içeremez");

        boolean length=false;
        if (password.length()>=8)
        {length=true;}
        else System.out.println("Şifre en az 8 karakter olmalı");

        if (firstLetter&&lastLetter&&space&&length){
            System.out.println("\nşifre geçerli");        }
        else System.out.println("\ngeçersiz şifre - yeni şifre oluşturun");


    }
}
