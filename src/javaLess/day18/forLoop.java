package javaLess.day18;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        //kullanıcıdan 10'dan küçük tam sayı  iste
        //faktöriyelini bul

        System.out.print("bir rakam girin : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = 1;
        String numbers ="";

        for (int i = 1; i <= num; i++) {
            result*=i;
            if (i<num){
            numbers=numbers+i+"*";}
            else numbers=numbers + i;
        }
        System.out.println(num+"! = "+numbers+" = "+result);
    }
}
