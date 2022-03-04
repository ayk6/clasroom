package day10;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        /*kullanıcıdan sayı "kaçıncı ay" sorusunun cevabını alıp ay ismi yazdır */
        //SWİTCH STATEMENT long,double,float ve boolean kullanamaz
        Scanner scan= new Scanner(System.in);
        System.out.println("kaçıncı ay olduğunu girin");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
                default:
                    System.out.println("hatalı giriş");

        }
        //break olmazsa çalıştığı satırdan sonrasının tamamını çalıştırır
        //default else gibi çalışır
    }
}
