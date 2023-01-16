package day32;

import java.util.HashMap;

public class C03_maps {
    // word count
    public static void main(String[] args) {
        String str = "knock knock, let the devil in manevolent as i have ever been";

        // remove punct
        str = str.replaceAll("\\p{Punct}","");

        String[] words = str.split(" ");

        HashMap<String,Integer> wordsCount= new HashMap<>();

        for (String w: words){
            Integer count = wordsCount.get(w);

            if (count == null){
                wordsCount.put(w,1);
            }else wordsCount.put(w,count+1);

            // wordsCount.merge(w, 1, Integer::sum); alternative
        }

        System.out.println(wordsCount);
    }
}
