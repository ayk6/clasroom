package practiceJava;

import java.util.Arrays;

public class C06arrayPlus1 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int num = 0;
        int x = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            num += x * digits[i];
            x *= 10;
        }
        num++;

        int numDigits = String.valueOf(num).length();
        int[] res = new int[numDigits];

        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = num % 10;
            num /= 10;
        }
        System.out.println(Arrays.toString(res));
    }
}
