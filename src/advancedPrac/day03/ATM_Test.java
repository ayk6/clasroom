package advancedPrac.day03;

import java.util.Scanner;

public class ATM_Test {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz */
        System.out.println("ATM'ye hoşgeldiniz\n" +
                "Yapmak istediğiniz işlemi tuşlayın\n" +
                "(Para yatırma-1, Para çekme-2, Bakiye sogulama-3, Çıkış-4)");
        Scanner scan = new Scanner(System.in);
        int total = 1000;
        int process = scan.nextInt();

        if (process<1||process>4){
            System.out.println("hatalı giriş");}
        else {
            switch (process){
                case 1:
                    System.out.println("yatırmak istediğiniz tutarı girin");
                    int amount = scan.nextInt();
                    if (amount>=0){
                    System.out.println("güncel bakiyeniz : "+(total+amount)+" TL");}
                    else System.out.println("hatalı giriş");
                    break;
                case 2:
                    System.out.println("çekmek istediğiniz tutarı girin");
                    int amount2 = scan.nextInt();
                    if (amount2>1000){
                        System.out.println("bakiye üzerinde çekim yapılamaz");}
                    else if (amount2<0){
                        System.out.println("hatalı giriş");}
                    else System.out.println("güncel bakiyeniz : "+(total-amount2)+" TL");
                        break;
                case 3:
                    System.out.println("mevcut bakiye : "+total+" TL");
                    break;
                case 4:
                    System.out.println("iyi günler dileriz");
            }
        }
    }
}
