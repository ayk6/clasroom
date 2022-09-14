package javaLess.day24;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        //index sayısı esnek array'ler
        //non-primitive kabul eder

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        List<String> arrayList3 = new ArrayList<>(); // en çok kullanılan

        System.out.println(arrayList3); // []

        //index eklemek için add() methodu kullanılır
        // index olmadan da çalışır
        List<String> words = new ArrayList<>();
        words.add("deneme1");
        words.add("deneme2");
        System.out.println(words); //[deneme1, deneme2]

        words.add(0,"deneme0");
        System.out.println(words); //[deneme0, deneme1, deneme2]





    }
}
