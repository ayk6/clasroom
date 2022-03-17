package day21;

import java.util.Arrays;

public class arrayDeclare {
    public static void main(String[] args) {
        int arr[];
        arr=new int[1];

        int[] arr2;
        // iki şekilde declare edilebilir

        int arr3[]=new int[6]; //default değerler atar - 6 tane 0
        int arr4[]= {10,4,4};
        //iki şekilde oluşturulur

        arr4[0]=66; //değer ataması yapılabilir

        System.out.println(arr.length); // array'in element sayısını verir

        for (int i=0; i<arr3.length; i++) {
            arr3[i] += i;
        }

        System.out.print(Arrays.toString(arr3));

        System.out.println(arr3[arr3.length-1]);


    }
}
