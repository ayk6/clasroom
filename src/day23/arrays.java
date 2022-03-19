package day23;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //bir array'e index ekle

        int[] array = {1, 2, 3};
        //4. element ekle
        //array[3] = 4; kabul etmez
        //array={1,2,3,4} kabul etmez, aynı boyut olsa da kabul etmez

        array = new int[4]; //0,0,0,0 yapar
        System.out.println(Arrays.toString(array));

        int[] arrayNew = new int[5];
        array = arrayNew; // 0,0,0,0,0
        System.out.println(Arrays.toString(array));

        int[] arrayNew2 = {1, 2, 3, 4};
        array = arrayNew2;
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 3,};//4. ekle
        int index = 4;

        array2 = arrayAddingİndex(array2, index);
        array2 = arrayAddingİndex(array2, 5);
        System.out.print("sonuç : "+Arrays.toString(array2));


    }

    private static int[] arrayAddingİndex(int[] array2, int index) {
        int[] newArray = new int[array2.length + 1]; //0,0,0,0

        for (int i = 0; i < array2.length; i++) {
            newArray[i] = array2[i];
            newArray[newArray.length - 1] = index;
        }
        return newArray;
    }
}
