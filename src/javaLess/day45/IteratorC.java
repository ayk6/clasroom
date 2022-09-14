package javaLess.day45;

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
        } // yalnızca loop içerisinde değiştirir, kalıcı olmaz

        Iterator itr= list.iterator();
        // iterator interface'tir, abstract olduğu için new obje oluşturulamaz
        // bu şekilde obje oluşturulabilir, var olan liste üzerinden obje oluşturuldu
        // iterator methodu abstract içerisinde ve body'siz method
        // ama arraylist class'ında override edilmiştir
        // iterator kullanmak için collection üyesi obje kullanılmalı (list ibi)
        // iterator oluştutulduğunda ilk elaman öncesine gider ve komut bekler

        System.out.println(itr.hasNext()); // true
        // ilk eleman öncesinde, sonrasında eleman var mı kontrol eder (boolean)

        System.out.println(itr.next()); // 4
        System.out.println(itr.next()); // 5
        // sonraki elemanı yazdırır, her seferinde ilerler

        itr.remove(); // bulunduğu elemanı siler
        System.out.println(list); // [4, 6, 7]
        // itr.remove(); sonraki elemanı silip ilerlemediğimiz için hata verir
        // remove iki kez üst üste kullanılamaz. öncelikle next kullanılmalı

    }
}
