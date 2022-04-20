package day45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorC {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list); // [4, 5, 6, 7]

        // her elemanı iki artır
        for (Integer each:list){
            each=each+2;
        } // yalnızca loop içerisinde değiştirir

        Iterator itr= list.iterator();
        // iterator interface'tir
        // bu şekilde obje oluşturulabilir

    }
}
