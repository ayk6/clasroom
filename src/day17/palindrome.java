package day17;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        //Kullanıcıdan String al
        //palindrom olup olmadığını kontrol et

        Scanner scan = new Scanner(System.in);
        System.out.print("kelime girin : ");
        String word = scan.next();

        palindromeMethod(word);
    }

    private static void palindromeMethod(String word) {
        String reverse = "";
        for (int i =word.length()-1; i >=0; i--) {
            reverse += word.charAt(i);}
            System.out.println("kelimenin ters yazılılışı : " +reverse);

            if (word.equalsIgnoreCase(reverse)){
                System.out.println("palindrome");}
            else System.out.println("not palindrome");


    }
}
