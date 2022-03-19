package day22;

import java.util.Arrays;

public class arrayContains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // istenen sayı var mı kontrol et t or f yazdır

        int num = 18;

        checkNumber(array, num);

        System.out.println(Arrays.binarySearch(array,num));
        // kaçıncı indexte olduğunu yazdırır, önce sort yapılmazsa yanlış sonuç verebilir
        // yoksa olsaydı sort indexini -(index+1) olarak verir
    }

    private static void checkNumber(int[] array, int num) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                result=true;
                break;
            }
        }
        System.out.println(result);
    }
}
