package day17;

import java.util.ArrayList;
import java.util.List;

public class C01arrayLists {
    public static void main(String[] args) {
        // removeAll(list) removes given list elements
        List<String> names = new ArrayList<>();
        names.add("jesse");
        names.add("walt");
        names.add("jim");
        names.add("mike");
        names.add("nacho");
        names.add("gus");

        List<String> names2 = new ArrayList<>();
        names2.add("jesse");
        names2.add("gus");
        names2.add("walt");
        names2.add("adas");

        System.out.println(names.contains("jim")); // true
        System.out.println(names.containsAll(names2)); // false
        names.removeAll(names2);
        System.out.println(names); // [jim, mike, nacho]

        names.add("mike");
        names.remove("mike");
        // remove() removes first match
        System.out.println(names); // [jim, nacho, mike]

        names.add(1, "mike");
        List<String> names3 = new ArrayList<>();
        names3.add("mike");
        names3.add("jim");

        names.removeAll(names3); // returns boolean
        System.out.println(names); // [nacho]
    }
}
