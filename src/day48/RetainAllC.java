package day48;

import java.util.HashSet;
import java.util.Set;

public class RetainAllC {
    public static void main(String[] args) {

        //  verilen set'teki tüm elemanlar diğer sette varsa geri kalanları siler
        // true döndürür

        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();

        set1.add(4); set1.add(6);
        set2.addAll(set1);
        set2.add(8);

        System.out.println(set1); // [4, 6]
        System.out.println(set2); // [4, 6, 8]

        System.out.println(set2.retainAll(set1));

        System.out.println(set1); // [4, 6]
        System.out.println(set2); // [4, 6]

    }
}
