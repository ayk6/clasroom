
package advancedPrac.day02;

import java.util.Scanner;

public class ifElsePractice {
    public static void main(String[] args) {
        /*     Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
        en kucuk olanlarini konsola yazdiriniz*/

        System.out.println("3 tam sayı girin");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " en büyük sayı");
            if (num2 <= num3) {
                System.out.println(num2 + " en küçük sayı");
            } else System.out.println(num3 + " en küçük sayı");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " en büyük sayı");
            if (num1 <= num3) {
                System.out.println(num1 + " en küçük sayı");
            } else System.out.println(num3 + " en küçük sayı");
        }
        else {
            System.out.println(num3 + " en büyük sayı");
            if (num1 >= num2) {
                System.out.println(num2 + " en küçük sayı");
            } else System.out.println(num1 + "en küçük sayı");
        }

    }
}

