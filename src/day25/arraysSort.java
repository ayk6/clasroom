package day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraysSort {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("qwerty");
        letters.add("zxc");
        letters.add(1,"asd");
        System.out.println(letters); //[qwerty, asd, zxc]

        Collections.sort(letters); // indexlerin içeriğine göre alfabetik dizilimini yapr
        System.out.println(letters); //[asd, qwerty, zxc]

    }
}
