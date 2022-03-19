package day24;

import java.util.ArrayList;
import java.util.List;

public class arrayLİstSet {
    public static void main(String[] args) {
        // set() methodu index içeriğini değiştirir

        List<String> words = new ArrayList<String>();
        words.add("first");
        words.add("second");
        words.add("third");
        System.out.println(words); //[first, second, third]

        words.set(0,"newFirst");
        System.out.println(words); //[newFirst, second, third]

        List<String> wordsNew = new ArrayList<String>();

        wordsNew.add(words.set(0,"first")); //listeyi güncelledi
                                            //silinen indexi yeni list e kaydetti

        System.out.println(words);
        System.out.println(wordsNew);




    }
}
