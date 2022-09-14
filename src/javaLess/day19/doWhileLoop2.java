package javaLess.day19;

import java.util.Scanner;

public class doWhileLoop2 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //  ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //  yanlislikla kac negative sayi girdigini
        //  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int result = 0;
        int countPositive = 0;
        int countNegative = 0;

        do {
            System.out.print("toplama işlemi için sayı girişi yapın\n" +
                    "bitirmek için 0'a basın : ");
            num = scan.nextInt();
            System.out.println("");
            if (num<0){
                System.out.println("negatif sayı girilemez");
                countNegative++;
            }
            else if (num>0){
                result+=num;
            countPositive++;}


        }while (num!=0);{
            System.out.println("girilen pozitif sayılar toplamı : " +result+
                    "\ngirilen pozitif sayı adedi : "+countPositive+
                    "\ngirilen negatif sayı adedi : "+countNegative);
        }

    }

}
