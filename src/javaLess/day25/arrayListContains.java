package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class arrayListContains {
    public static void main(String[] args) {

        List <String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("K");
        letters.add(1,"Y");
        System.out.println(letters);

        letters.contains("A"); // true or false döner
        System.out.println(letters.contains("Y")); //T
        System.out.println(letters.contains("1")); //F

        List <String> letters2 = new ArrayList<>();
        letters2.add("A");
        letters2.add("K");
        System.out.println(letters.containsAll(letters2)); //t
        // listler arasında kontrol yapar, aynı elemanlar varsa true
        letters2.add("Z");
        System.out.println(letters.containsAll(letters2)); //f


    }
}
