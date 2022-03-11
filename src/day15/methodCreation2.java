package day15;

import java.util.Scanner;

public class methodCreation2 {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime yazın");
        String word = scan.next();
        int numLetter=word.length();

        if (numLetter<3){
            System.out.println("kelime kısa");
        }
        else if (numLetter==3){
            reverseThreeLetterWord(word); //method içinde kullanılacak kelimeyi içinde taşımak gerekiyor
        }
        else if (numLetter==4){
            reverseFourLetterWord(word);
        }
        else if (numLetter==5){
            reverseFiveLetterWord(word);
        }
        else System.out.println("kelime uzun");
    }

    private static void reverseFiveLetterWord(String word) {
        String wordReverse = word.substring(4) +
                word.substring(3, 4) +
                word.substring(2, 3) +
                word.substring(1, 2) +
                word.substring(0, 1);
        System.out.println("kelime 5 harfli");
        System.out.println("kelimenin ters yazılışı : "+wordReverse);

    }
    private static void reverseFourLetterWord(String word) {
        String wordReverse = word.substring(3) +
                word.substring(2, 3) +
                word.substring(1, 2) +
                word.substring(0, 1);
        System.out.println("kelime 4 harfli");
        System.out.println("kelimenin ters yazılışı : "+wordReverse);
    }
    private static void reverseThreeLetterWord(String word) {
        String wordReverse = word.substring(2) +
                word.substring(1, 2) +
                word.substring(0, 1);
        System.out.println("kelime 3 harfli");
        System.out.println("kelimenin ters yazılışı : "+wordReverse);

    }

}
