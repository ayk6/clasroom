package day15;

import java.util.Arrays;

public class C01binarySearch {
    public static void main(String[] args) {
        // binarySearch()
        // needs sort
        // returns given element index
        // if element doesn't exist in array
            // returns negative index would be if existed

        int[] arr={0,-5,6,9,-8,15,-8,64,-13};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        // [-13, -8, -8, -5, 0, 6, 9, 15, 64]

        System.out.println(Arrays.binarySearch(arr, 5));//-6
        System.out.println(Arrays.binarySearch(arr, 6));//5
    }
}
