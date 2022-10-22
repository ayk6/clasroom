package practiceJava.preAdvanced;

import java.util.Arrays;

public class C04arrayMove {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length];

        arr2[arr2.length-1]=arr1[0];

        for (int i=0; i<arr2.length-1;i++){
            arr2[i]=arr1[i+1];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
