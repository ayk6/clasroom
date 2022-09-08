package basicPrac.day02;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("üç haneli sayı girin");
        int num=scan.nextInt();
        int onlarbasamak = (num/10)%10;



        if (num<100||num>999) {
            System.out.println("üç basamaklı sayı girmelisiniz");
        }else  {System.out.print("Girilen sayının onlar basamağı : ");
        switch (onlarbasamak){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("hatalı giriş");}
        }
        scan.close();

    }
}
