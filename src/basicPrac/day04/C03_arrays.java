package basicPrac.day04;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        // given an array, create a new array witn the numbers needed
        // to complete elements to 9

        int[] arr={5,9,3,-1,0,-8,7,4,10};

        for (int i=0; i<arr.length;i++){
            arr[i]=9-arr[i];
        }
        System.out.println(Arrays.toString(arr));

        // print pairs of numbers that add up to 9

        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (i+j==9){
                    System.out.print(i+" "+j+"\n");
                }
            }
        }


    }
}
