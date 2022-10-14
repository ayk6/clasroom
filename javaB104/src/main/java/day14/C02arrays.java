package day14;

import java.util.Arrays;

public class C02arrays {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 0, 9, 0};
        // move 0's to end

        int[] arr2 = new int[arr.length];
        int index =0;
        for (int num: arr) {
           if (num!=0){
               arr2[index]=num;
               index++;
           }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
