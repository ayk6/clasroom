package day22;

import java.util.Arrays;

public class arrayEquals_split {
    public static void main(String[] args) {
        // equals iki array eşit mi kontrol eder
        // sıraya da dikkat eder
        //t or f döner

        int[] array = {1,2,3,4};
        int[] array2 = {4,3,2,1};
        System.out.println(Arrays.equals(array,array2)); //false
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array,array2)); //true

        //split
        // string'i parçalara ayırır array'e çevirir

        String sentence = "burasi yolun degil sonun olur";
        String[] words=sentence.split(" ");
        //boşluklardan kelime olarak ayırdı

        System.out.println(Arrays.toString(words));
        System.out.println(words[2]);

        String[] words2=sentence.split("degil");
        System.out.println(Arrays.toString(words2));
        //degil'den ayırdı

        String[] letters=sentence.split("");
        System.out.println(Arrays.toString(letters));
        //tüm karakterleri ayırdı



    }
}
