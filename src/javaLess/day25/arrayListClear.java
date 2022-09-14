package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class arrayListClear {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("qwerty");
        letters.add("zxc");
        letters.add(1,"asd");
        System.out.println(letters); //[qwerty, asd, zxc]

        letters.clear();
        System.out.println(letters); // []

        //ArrayList içerisindeki her şeyi siler
    }
}
