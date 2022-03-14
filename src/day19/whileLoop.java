package day19;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        //kullanıcıdan sayı al, tam bölenleri ve kaç tane olduklarını yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.print("bir tam sayı yazın : ");
        int num = scan.nextInt();

        int count =0; int div =1;

        while (div<=num){
            if (num%div==0){
                System.out.print(div + " ");
                count++;
            }
            div++;
        }
        System.out.println("");
        System.out.println("bölen sayısı : "+ count);

    }
}
