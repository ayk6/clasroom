package day19;

import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {

        //kullanıcıdan sayı al, rakamları toplamını yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("bir tam sayı yazın : ");
        int num = scan.nextInt();

        int numeral =0;
        int result = 0;

        while (num>0){
            numeral=num%10;
            result+=numeral;
            num/=10;
        }
        System.out.println("girilen sayının rakamları toplamı : "+result);


    }
}
