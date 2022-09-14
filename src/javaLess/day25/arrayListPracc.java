package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class arrayListPracc {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array list olarak yazdiran bir method olusturun
        int array[]={3,4,2,3,5,7,3,8,5,2,4};
        int indexNonGrata=3;

        removeİndex(array,indexNonGrata);
    }

    private static void removeİndex(int[] array, int indexNonGrata) {

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<array.length;i++){
            if (array[i]!=indexNonGrata){
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }
}
