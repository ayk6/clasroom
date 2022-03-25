package day26;

import java.util.ArrayList;
import java.util.List;

public class forEachLoop3 {
    public static void main(String[] args) {

        // iki string array oluştur, ortak elemanları for-each ile bul
        // sonucu yazdır

        String[] array = {"k1","k2","k3","k4"};
        String[] array2 = {"k3","k5","k6","k4","k7"};

        List<String> list = new ArrayList<String>();

        for (String each:array
             ) {
            for (String each2:array2
                 ) {
                if (each.equals(each2)){
                    list.add(each);
                }
            }
        }
        if (list.isEmpty()){
            System.out.println("ortak eleman yok");
        }
        else System.out.println(list);
    }
}
