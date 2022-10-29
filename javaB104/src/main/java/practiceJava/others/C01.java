package practiceJava.others;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {

        // Question= [0,2,3,12,2,12,2] put the all two to the end--->[0,3,12,2,2,2]

        int[] arr = {0, 2, 3, 12, 2, 12, 2};
        int[] arr2 = new int[arr.length];

        int twoCount = 0, otherCount = 0;

        for (int j : arr) {
            if (j == 2) {
                arr2[arr.length - otherCount - 1] = 2;
                otherCount++;
            } else {
                arr2[twoCount] = j;
                twoCount++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
