package day16;

import java.util.ArrayList;
import java.util.List;

public class C04arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Integer> intList2 = new ArrayList<>();
        List<Integer> intList3 = new ArrayList<>();
        // all the same

        // print list
        System.out.println(intList);

        // add element
        intList.add(10);
        intList.add(4);  // adds at the end
        // add method returns boolean
        intList.add(1, 5); // adds 1. index
        // returns none

        intList2.add(3);
        intList.addAll(intList2); // [10, 5, 4, 3]
        // adds at the end , returns boolean

        intList.addAll(2, intList2); // [10, 5, 3, 4, 3]
        // adds at the index and returns boolean

        System.out.println(intList.size()); // 5 - length
        System.out.println(intList.get(4)); // 4. element
        System.out.println(intList.isEmpty()); // boolean

        System.out.println(intList.set(4, 15)); // 3
        // returns old value - Integer

        intList.remove(4);  // 15
        // returns removed value - Integer
        System.out.println(intList.remove((Integer) 3));
        // removes given element and returns boolean
        // bcs int is index, wrapper is element


    }
}
