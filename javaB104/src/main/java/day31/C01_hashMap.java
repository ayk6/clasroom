package day31;

import java.util.*;

public class C01_hashMap {
    public static void main(String[] args) {
        // Hashmaps use key and value structure
        // Keys are uniq but values not must be
        // if we use keyword again, it overrides
        // map elements = EntrySet, Entry
        // randomly sort

        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Walt",50);
        studentAges.put("Will",35);
        System.out.println(studentAges); // {Walt=50, Will=35}
        studentAges.put("Will",36);
        System.out.println(studentAges); // {Walt=50, Will=36}
        studentAges.put(null,null);
        studentAges.put("Hank",null);

        Set<String> hashMapKeys=studentAges.keySet();
        System.out.println(hashMapKeys); // [null, Hank, Walt, Will]

        Collection<Integer> hashMapValues = studentAges.values();
        System.out.println(hashMapValues); //[null, null, 50, 36]

        System.out.println(studentAges.get("Will")); // 36
        // returns keys value

        studentAges.remove(null); // if remove, returns removed value
        // else returns null
        System.out.println(studentAges);

        studentAges.remove("Hank",null); // if remove, returns true
        // else returns false

    }
}
