package day22;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        String array[] = {"a","y","k"};

        System.out.println(Arrays.toString(array)); //a, y, k

        Arrays.sort(array);  //sıralama yapar, küçükten büyüğe ya da alfabe

        System.out.println(Arrays.toString(array));

        int[] array2 = {1,2,3,4,5}; //en küçük ve en büyük değeri yazdır
        Arrays.sort(array2);
        System.out.println(""+array2[0]+" - "+array2[array2.length-1]);


        //en küçük ve en büyük değeri yazdır (loop ile)
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i <array2.length ; i++){
            if (array2[i]<min) {
                min=array2[i];
            }
            if (array2[i]>max){
                max=array2[i];
            }
        }
            System.out.println("" +min + " - "+ max );



    }
}
