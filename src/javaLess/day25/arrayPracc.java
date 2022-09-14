package javaLess.day25;

import java.util.Arrays;

public class arrayPracc {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun
        int array[]={3,4,2,3,5,7,3,8,5,2,4};
        int indexNonGrata=3;
        
        removeİndex(array,indexNonGrata);

    }

    private static void removeİndex(int[] array, int indexNonGrata) {
        int count=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==indexNonGrata) {
                count++;
            }
        }
        int[] newArray= new int[array.length-count];
        int index=0;
        for (int i=0; i<array.length; i++){
            if (array[i]!=indexNonGrata){
                newArray[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
