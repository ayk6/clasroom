package javaLess.day23;

import java.util.Arrays;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        // array iç içe array'lerden oluşabilir
        int[][][] array = {{{1,2},{3,4},{5,6}},{{7,8},{9,0},{1,2}}};
        //grand parent array, parent array, child array
        //ya da outer-inner arrays

        System.out.println(array[0][0][0]); //1
        System.out.println(array[0][1][1]); //4
        System.out.println(Arrays.toString(array)); //referans değerleri yazdırır
        System.out.println(Arrays.toString(array[0][0])); //[1,2]

        //tüm elementleri yazdırmak
        System.out.println(Arrays.deepToString(array));

        //tüm elementler toplamını bul
        int[][] array2 = {{5,6},{7,8}};
        int result = 0;

        for (int i = 0 ; i < array2.length; i++){
            for (int j = 0 ; j < array2[i].length; j++){
                result+= array2[i][j];
            }
        }
        System.out.println("sayılar toplamı : "+result);
    }
}
