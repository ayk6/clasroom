
package advancedPrac.day02;

import java.util.Scanner;

public class ternaryTest {
    public static void main(String[] args) {
        /*         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif tam sayı girin : ");
        int num= scan.nextInt();

    String sonuc=num<=0?"pozitif tam sayı girmelisin":
            ((num>99&&num<1000)?
                    ("sayı üç basamaklı"):
                    (num%2==0?"üç basamaklı olmayan çift sayı":
                            "üç basamaklı olmayan tek sayı"));
        System.out.println(sonuc);


    }
}
