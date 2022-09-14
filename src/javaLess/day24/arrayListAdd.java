package javaLess.day24;

import java.util.ArrayList;
import java.util.List;

public class arrayListAdd {
    public static void main(String[] args) {

        //int list oluştur
        List<Integer> listNumbers = new ArrayList<>();
        System.out.println(listNumbers); //[]
        listNumbers.add(1); //[1]
        listNumbers.add(2); //[1,2]
        listNumbers.add(4); //[1,2,4]
        listNumbers.add(0,0); //[0,1,2,4]
        listNumbers.add(3,3); //[0,1,2,3,4]
        System.out.println(listNumbers);

        //arrayList boyutu yazdırma
        System.out.println(listNumbers.size()); //5

        //arrayList boş mu kontrol etme- boolean döner
        System.out.println(listNumbers.isEmpty()); //false

    }
}
