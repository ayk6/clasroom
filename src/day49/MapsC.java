package day49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsC {
    public static void main(String[] args) {
        // map interface'dir
        //

        List<Object> list = new ArrayList<>();
        list.add("saldıray");
        list.add(10);

        System.out.println(list); // [saldıray, 10]

        list.set(1,(Integer)(list.get(1))+10);
        // data türü object olursa her data türüne değer ekelenebilir
        // ama casting gerektirir

        System.out.println(list); // [saldıray, 20]

        Map<Integer,String> classMap = new HashMap<>();
        // ilk veri key - tek ve uniq olmalı - öğrenci no
        // ikinci veri list, birden fazla olabilir, isim, soyisim, branş
        // tüm elemanlar value olmalıdır

        classMap.put(1,"öğr, bir, mat");
        classMap.put(2,"öğr, iki, tr");
        classMap.put(3,"öğr, üç, fizik");

        System.out.println(classMap);
        // {1=öğr, bir, mat, 2=öğr, iki, tr, 3=öğr, üç, fizik}

        System.out.println(classMap.keySet()); // [1, 2, 3]
        System.out.println(classMap.values()); // [öğr, bir, mat, öğr, iki, tr, öğr, üç, fizik]



    }
}
