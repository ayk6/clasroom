package practiceJava.others;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        // Have the function SimpleEvens(num) check whether every single
        // number in the passed in parameter is even. If so, return the
        // string true, otherwise return the string false. For example:
        // if num is 4602225 your program should return the string false
        // because 5 is not an even number.

        Scanner scan = new Scanner(System.in);
        System.out.print("Your number : ");
        int num = scan.nextInt();

        System.out.println(simpleEvens(num));
    }

    private static String simpleEvens(int num) {
        while (num >= 1) {
            int digit = num % 10;
            if (digit % 2 == 1) return "false";
            num /= 10;
        }
        return "true";
    }
}
