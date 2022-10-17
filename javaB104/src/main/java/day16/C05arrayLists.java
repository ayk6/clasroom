package day16;

import java.util.ArrayList;
import java.util.List;

public class C05arrayLists {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(6);
        intList.add(0);
        intList.add(9);
        intList.add(27);

        // increase 11 odd nums and print list

        for (int anInt : intList){
            if (anInt%2==1){
                intList.set(intList.indexOf(anInt),anInt+11);
            }
        }
        System.out.println(intList);
    }
}
