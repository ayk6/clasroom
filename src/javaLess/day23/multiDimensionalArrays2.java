package javaLess.day23;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArrays2 {
    public static void main(String[] args) {
        //24 öğrenciden oluşan 8 sınıfın array kalıbını oluştur
        int[][] array = new int[8][24];

        // 5 okullu şehir ekle
        int[][][] array2 = new int[5][8][24];

        //sayılar farklı olursa ayrı komutlar gerekir

        //array index sayısını ve indexleri kullanıcıdan al

        Scanner scan = new Scanner(System.in);
        System.out.print("Array index sayısını yazın : ");
        int length = scan.nextInt();
        int[]array3=new int[length];

        for (int i=0; i<length; i++){
            System.out.print("Array'in "+(i+1)+ ". indexini yazın : ");
            array3[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(array3));

    }
}
