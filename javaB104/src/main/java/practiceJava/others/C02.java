package practiceJava.others;

import java.util.Scanner;
import java.util.SortedMap;

public class C02 {
    public static void main(String[] args) {
        // armstrong num

        Scanner scan = new Scanner(System.in);
        System.out.print("Your number : ");
        int num = scan.nextInt();

        System.out.println(isArmstrongNumber(num));
    }

    private static boolean isArmstrongNumber(int num) {
        int tempNum=num;
        int digitCount=String.valueOf(num).length();
        int sum =0;
        do {
            int digit=tempNum%10;
            sum+=Math.pow(digit,digitCount);
            tempNum/=10;
        }while (tempNum>=1);
        return sum == num;
    }
}
