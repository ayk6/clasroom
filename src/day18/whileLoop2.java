package day18;

import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {
        //kullanıcıdan sayı adedi al, o adette sayı al ve topla

        Scanner scan = new Scanner(System.in);
        System.out.print("kaç adet sayı toplayacağınızı yazın : ");
        int totalNumber= scan.nextInt();
        int result = 0;


        for (int i=1; i<=totalNumber; i++) {
            System.out.print("sayı girin : ");
            int num = scan.nextInt();
            result+=num;
        }
        System.out.println(totalNumber+ " adet sayının toplamı : "+ result);

        //while

        int num2 =0; result =0; int count =1;
        while (count<=totalNumber){System.out.print("sayı girin : ");
            int num = scan.nextInt();
            result+=num; count++;
        }
        System.out.println(totalNumber+ " adet sayının toplamı : "+ result);






    }
}
