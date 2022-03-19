package day24;

import java.util.ArrayList;
import java.util.List;

public class arrayListRemove {
    public static void main(String[] args) {
        List<String> listWords = new ArrayList<>();

        listWords.add("deneme1");
        listWords.add("deneme2");
        listWords.add(0,"deneme0");
        System.out.println(listWords);

        //objenin kendisi silinebilir
        listWords.remove("deneme0"); //boolean sonuç verir
        //ilkini siler
        //çalışırsa true, çalışamazsa false
        boolean result = listWords.remove("deneme1");
        System.out.println(result); //true

        System.out.println(listWords); //deneme2

        listWords.add(0,"deneme0");
        System.out.println(listWords); //deneme0, deneme2

        //index silme
        listWords.remove(1); //yazdırılırsa silinen indexin içerğini yazdırır
        System.out.println(listWords.remove(0)); //deneme0
        //olmayan index silinirse rte verir

    }
}
