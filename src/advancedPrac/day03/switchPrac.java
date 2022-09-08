package advancedPrac.day03;

import java.util.Scanner;

public class switchPrac {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.println("kaçıncı aydasınız?");
        int month = scan.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gündür");
                break;
            case 2:
                System.out.println("hangi yılda olduğunuzu yazın");
                int year = scan.nextInt();
                if (year%4==0){
                System.out.println("girilen ay 29 gündür");}
                else System.out.println("girilen ay 28 gündür");
                break;
            default:
                System.out.println("hatalı ay girişi");

        }


    }
}
