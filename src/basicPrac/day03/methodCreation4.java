package basicPrac.day03;

import java.util.Scanner;

public class methodCreation4 {
    public static void main(String[] args) {
        //kullanıcıdan alınan tam sayı ile fibonacci dizisi oluştur.
        // elemen sayısı kullanıcıdan alınan sayı olsun

        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı yazın : ");
        int num = scan.nextInt();
        fibonacci(num);


    }

    public static void fibonacci(int num) {
        int num2=0;
        int num3=1;
        int num4;
        if(num>0){
            for (int i=2;i<=num;i++){
                num4=num2+num3;
                System.out.print(num3 +" - ");
                num2=num3;
                num3=num4;

            }
        }
        else System.out.println("pozitif tam sayı yazılmalı");
    }

}
