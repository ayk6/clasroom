package practiceJava.day01;

import java.util.Arrays;

public class C04mountainArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,5,3,1,0};
        int[] arr2 = arr.clone();

        Arrays.sort(arr2);

        int peek = arr2[arr2.length-1];

        for (int i =0;i<arr.length;i++){
            if (arr[i] == peek) peek =i;
        }

        System.out.println(isMountain(arr, peek));
    }

    private static boolean isMountain(int[] arr, int peek) {
        if (peek==0||peek== arr.length-1) return false;

        for (int i=0;i<peek;i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }

        for (int i =peek ;i< arr.length-1;i++){
            if (arr[i]<=arr[i+1]) return false;
        }
        return true;
    }
}
