package javaLess.day49;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapPrac {
    public static void main(String[] args) {
        Map<Integer,String> cls =MapMain.mainMap();
        System.out.println(cls);
        // {1001=Saldıray, Durgun, QA, 1002=Bülent, Avi, C#, 1003=Vedat, İşçi, Dev}
    }
    public static void printClass(Map<Integer,String> cls) {
        System.out.println("Numara  İsim  Soyisim  Branş");
        System.out.println("============================");

        // map'i anlaşılır şekilde yazdırmak için öncelikle
        // key ve value'ları iki farklı collections üyesine atadık

        Set<Integer>keySet=cls.keySet();
        Collection<String> valueSet=cls.values();
    }
}
