package day24;

import java.util.ArrayList;
import java.util.List;

public class arrayListGet {
    public static void main(String[] args) {

        //listeyi değiştirmez, istenen indexteki veriyi alır

        List<Integer> listNumbers = new ArrayList<>();
        System.out.println(listNumbers); //[]
        listNumbers.add(10); //[10]
        listNumbers.add(11); //[10,11]
        listNumbers.add(3); //[10,11,13]
        listNumbers.add(2,12); //[10,11,12,13]
        listNumbers.add(4,14); //[10,11,12,13]

        System.out.println(listNumbers); //[10, 11, 12, 3, 14]

        System.out.println(listNumbers.get(2)); //12
    }
}
