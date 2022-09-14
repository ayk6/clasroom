package javaLess.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {
    public static void main(String[] args) {
        //verilen array'i List'e dönüştür

        String[] array = {"q","w","e"};
        List<String> arrayToList = Arrays.asList(array);
        System.out.println(arrayToList); //[q, w, e]

        //eleman sayısı değiştirmeye, ekleyip çıkarmaya izin vermez
        // add(), remove(), clear() gibi methodlar çalışmaz

        //değişiklik yapıldığında ikisinde birden değişir
        array[1] ="t";

        System.out.println(arrayToList); //[q, t, e]
        System.out.println(Arrays.toString(array)); //[q, t, e]


        arrayToList.set(1,"w");

        System.out.println(arrayToList); //[q, w, e]
        System.out.println(Arrays.toString(array)); //[q, w, e]
    }
}
