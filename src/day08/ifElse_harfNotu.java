package day08;

import java.util.Scanner;

public class ifElse_harfNotu {
    public static void main(String[] args) {
        //kullanıcıdan 100 üzerinden not alıp harf notuna çevir
        Scanner scan = new Scanner(System.in);
        System.out.println("NOtunuzu girin");

        double notYuzde = scan.nextDouble();
        if (notYuzde<0 || notYuzde>100) {
            System.out.println("Hatalı giriş yaptınız");        }
        else if (notYuzde<50){
            System.out.println(" Notunuz FF");}
        else if (notYuzde<65){
            System.out.println("Notunuz DD");}
        else if (notYuzde<75){
            System.out.println("Notunuz CC");}
        else if (notYuzde<90){
            System.out.println("Notunuz BB");}
        else
            System.out.println("Notunuz AA");
        }
    }


