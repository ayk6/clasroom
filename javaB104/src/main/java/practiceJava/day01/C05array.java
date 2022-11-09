package practiceJava.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class C05array {
    public static void main(String[] args) {

        /*
         Print just non-repeated elements from an array
    */
        int[] arr = {10, 2, 5, 4, 6, 8, 9, 2, 1, 4, 5, 8, 9};
        tekrarsizYazdirma(arr);
        System.out.println();
        tekrarsizYazdirmaList(arr);


    }

    private static void tekrarsizYazdirma(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean tekrarEdiyorMu = false;
            for (int k = 0; k < arr.length; k++) {
                if (i != k && arr[i] == arr[k]) {
                    tekrarEdiyorMu = true;
                    break;
                }
            }
            if (!tekrarEdiyorMu) {
                System.out.print(" " + arr[i]);
            }
        }
    }

    private static void tekrarsizYazdirmaList(int[] arr) {
        List<Integer> arrayToList = new ArrayList<>();
        for (int t : arr) {
            arrayToList.add(t);
        }
        List<Integer> tekrarsizList = new ArrayList<>();

        for (int t : arr) {
            if (arrayToList.indexOf(t) == arrayToList.lastIndexOf(t)) {
                tekrarsizList.add(t);
            }
        }
        System.out.println(tekrarsizList);
    }
}
