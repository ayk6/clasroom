package javaLess.day52;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("A",2);
        myMap.put("A",4);
        myMap.put("H",3); // varsa silip yerine atar
        myMap.putIfAbsent("K",5); // yalnızca yoksa çalışır
        // yoksa ekler null döndürür, varsa var olan değeri getirir
        // myMap.putAll(...); var olan map'i ekler
        System.out.println(myMap); // {A=4, H=3, K=5}

        myMap.computeIfAbsent("A",v->20); // var olduğu için değiştirmedi
        myMap.compute("A",(k,v)->10); // değiştirir

        System.out.println(myMap); // {A=10, H=3, K=5}

        // A değerini 5 artır
        myMap.compute("A",(k,v)->(v+5));

        System.out.println(myMap); // {A=15, H=3, K=5}

    }
}
