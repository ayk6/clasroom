package basicPrac.day02;

import java.util.Locale;
import java.util.Scanner;

public class strinManipulation02 {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
           (gh  -  g  -  h   : 3 durum var)
         */

        System.out.print("bir kelime yazın : ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase(Locale.ROOT);

        if (word.startsWith("gh")){
            System.out.println(word);}
        else if (word.startsWith("g")){
            System.out.println(word.substring(0,1)+word.substring(2)); }
        else if (word.substring(1).startsWith("h")){
            System.out.println(word.substring(1)); }
        else System.out.println(word.substring(2));


    }
}
