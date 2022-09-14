package javaLess.day24;

import java.util.ArrayList;
import java.util.List;

public class arrayListRemove2 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        System.out.println(listNumbers); //[]
        listNumbers.add(1); //[1]
        listNumbers.add(2); //[1,2]
        listNumbers.add(4); //[1,2,4]
        listNumbers.add(0,0); //[0,1,2,4]
        listNumbers.add(3,3); //[0,1,2,3,4]

        listNumbers.remove(3); //3. indexi atar
        int num=3;
        listNumbers.remove(num); //3. indexi siler
        System.out.println(listNumbers);
        listNumbers.add(3,3); //[0,1,2,3,]
        listNumbers.add(4,5); //[0,1,2,3,5]

        Integer num2 = 5;
        listNumbers.remove(num2); //obj. kabul eder ve içeriği siler
        System.out.println(listNumbers); //[0,1,2,3]
    }
}
