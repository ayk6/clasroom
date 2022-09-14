package javaLess.day21;

import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {

        String arr1[]={"asd","qwe","zxcvb"};

        System.out.println(arr1[0]); //ilk veriyi yazdırır "asd"

        arr1[2]="zxc"; //değer değiştirilebilir. 2. index değişti
        System.out.println(arr1[2]);

        System.out.println(arr1); // [Ljava.lang.String;@5b464ce8 yazdırdı
        //referans değerleri yazdırır

        //içeriği yazdırmak için

        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");  //uzun yöntem
        }
        System.out.println("");

        System.out.println(Arrays.toString(arr1)); //köşeli parantez içine yazdırdı

        int arr2[]={1,2,3};
        arr2[2]=4;
        System.out.println(Arrays.toString(arr2));

    }
}
