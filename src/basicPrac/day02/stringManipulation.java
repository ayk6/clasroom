package basicPrac.day02;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
         /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     */
        System.out.print("bir kelime yazın : ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if (word.length()>=3){
            System.out.println(word.substring(word.length()-2)+
                    word.substring(word.length()-2)+word.substring(word.length()-2));}
        else System.out.println(word);
        }

    }

