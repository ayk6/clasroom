package day47;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPracc {
    // verilen array'den tekrarlanana elemanları sil
    // set'lerde index yapısı yoktur. for each kullanılır

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4 ,8,5,49,4,3,1,2,78,7,7,8,8,8,6,66,1};

        array = uniqueMethode(array);

        System.out.println(Arrays.toString(array));
    }

    private static int[] uniqueMethode(int[] array) {
        Set <Integer> set = new HashSet<Integer>();

        for (int each: array){
            set.add(each);
        }
        System.out.println(set);

        int[] arraySet=new int[set.size()];
        int index=0;
        for (Integer each:arraySet
             ) {
            arraySet[index]=each;
            index++;
        }

        return array;
    }
}
