package day22;

import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // büyükten küçüğe sırala ve kaydet

        System.out.println(Arrays.toString(array));

        //method oluştur
        array = reverseSave(array);

        System.out.println(Arrays.toString(array));
    }

    private static int[] reverseSave(int[] array) {
        Arrays.sort(array);
        int[] reverseArray = new int[array.length]; // 0,0,0,0,0,0,0,0,0
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }
}
