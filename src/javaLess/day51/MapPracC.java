package javaLess.day51;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPracC {
    // verilen String'deki harfleri ve kaçar kez kullanıldığını
    // döndüren method oluştur
    public static void main(String[] args) {

        String input ="Deneme";
        String[] lettersArray=input.split("");
        System.out.println(Arrays.toString(lettersArray)); // [D, e, n, e, m, e]

        Map<String,Integer> usingLetter = new HashMap<>();

        for (String each: lettersArray
             ) {
            if (usingLetter.containsKey(each)){
                usingLetter.put(each, usingLetter.get(each)+1);
            }
            else usingLetter.put(each, 1);
        }
        System.out.println(usingLetter); // {D=1, e=3, m=1, n=1}
    }
}
