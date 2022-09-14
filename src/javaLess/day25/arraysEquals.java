package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class arraysEquals {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        List<String> letters2 = new ArrayList<>();

        System.out.println(letters.equals(letters2)); //t
        // indexler ve dizilimler aynı mı kontrol eder, boolean sonuç verir

        letters.add("A");
        letters.add("W");
        letters2.add("W");
        letters2.add("A");

        System.out.println(letters.equals(letters2)); //f
        // indexler aynı ama dizilim farklı
    }
}
