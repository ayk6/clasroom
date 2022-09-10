package basicPrac.day04;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        // given an array. create a new array with given numbers square
        int[] arr = {2, 6, 4, 8, 5, 9};
        for (int i=0; i<arr.length; i++){
            arr[i] *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
