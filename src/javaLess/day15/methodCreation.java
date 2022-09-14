package javaLess.day15;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime yazın");
        String word = scan.next();
        String wordReverse = "";

        if (word.length() < 3) {
            System.out.println("kelime kısa");
        } else if (word.length() <= 5) {
            if (word.length() == 3) {
                wordReverse = word.substring(2) +
                        word.substring(1, 2) +
                        word.substring(0, 1);
            } else if (word.length() == 4) {
                wordReverse = word.substring(3) +
                        word.substring(2, 3) +
                        word.substring(1, 2) +
                        word.substring(0, 1);
            } else {
                wordReverse = word.substring(4) +
                        word.substring(3, 4) +
                        word.substring(2, 3) +
                        word.substring(1, 2) +
                        word.substring(0, 1);
            }
            System.out.println("kelime " + word.length() + " harfli,\n" +
                    "kelimenin tersten yazılışı : " + wordReverse);
        } else System.out.println("kelime uzun");
    }
}
