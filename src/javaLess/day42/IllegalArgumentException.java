package javaLess.day42;

import java.util.Scanner;

public class IllegalArgumentException extends Throwable {
    // kullanıcıdan yaş iste, negatif ya da 120+ girilirse
    // illegala arg exc. yazdır
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yaşınızı yazın : ");
        int age= scan.nextInt();

        if (age < 0|| age>120) {
            throw new IllegalArgumentException();
        }else {
            System.out.println("Geçerli yaş girişi.");
        }

    }


}
