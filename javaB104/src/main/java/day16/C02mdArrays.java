package day16;

import java.util.Arrays;

public class C02mdArrays {
    public static void main(String[] args) {
        // turn md array to array
        int arr[][] = {{8, 5}, {9, 0, -6}, {1}};

        int length = 0;

        for (int[] arr2 : arr) {
            length += arr2.length;
        }

        int[] resArr = new int[length];
        int index = 0;


        for (int[] ints : arr) {
            for (int anInt : ints) {
                resArr[index] = anInt;
                index++;
            }
        }
        System.out.println(Arrays.toString(resArr));
    }
}
