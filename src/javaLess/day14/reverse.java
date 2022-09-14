package javaLess.day14;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        //
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfi buyuk,
        // digerleri kucuk olarak tersten yazdirin.

        System.out.print("4 harfli kelime girin : ");

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String reverseWord= word.substring(3).toUpperCase() +
                word.substring(2,3).toLowerCase()+
                word.substring(1,2).toLowerCase()+
                word.substring(0,1).toLowerCase();


        System.out.println(reverseWord);
    }
}
