package javaLess.day22;

import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        // büyükten küçüğe sırala ve yazdır

        //method oluştur
        reverseWrite(array);
        System.out.println("");
        reverseWrite2(array);
    }

    private static void reverseWrite2(int[] array) {
        Arrays.sort(array); // 1,2,3,4,5,6,7,8,9
        int[] reverseArray = new int[array.length]; // 0,0,0,0,0,0,0,0,0
        for (int i =0; i< array.length;i++){
            reverseArray[i]=array[array.length-1-i];
        }
        System.out.print(Arrays.toString(reverseArray));
    }

    private static void reverseWrite(int[] array) {
        Arrays.sort(array);
        for (int i =array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]+", ");
        }

    }
}
