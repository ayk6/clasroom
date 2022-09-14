package javaLess.day10;

import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        //"kaçıncı ay" sorusunun cevabını alıp mevsimini yazdır
    Scanner scan = new Scanner(System.in);

    int ayNo=scan.nextInt();

    switch (ayNo){
        case 12:
        case 1:
        case 2:
            System.out.println("KIŞ");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("İLKBAHAR");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("YAZ");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("SONBAHAR");
            break;
        default:
            System.out.println("hatalı giriş");
    }

    }
}
