package lambda.day03;

import lambda.day01.C01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList(
                "ilkEleman","iki","üç","dört","dört","sonElemann"));

        // alfabetik büyük harf ve tekrarsız yazdır
        strList.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t+" "));
        System.out.println("");
        // elemanların karakter sayılarını ters sıralı yazdır
        strList.stream().distinct().map(String::length).sorted(Comparator.reverseOrder()).forEach(C01::printt);
        System.out.println("");
        // karakter sayılarına göre sırala yazdır
        strList.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+" "));
        System.out.println("");
        // son harfine göre ters sırala yazdır
        strList.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(t-> System.out.print(t+" "));
    }
}
