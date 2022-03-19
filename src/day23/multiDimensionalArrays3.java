package day23;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionalArrays3 {
    public static void main(String[] args) {

        //kullanıcıdan cümle al, kelime sayısını yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("cümle yazın : ");
        String sentence= scan.nextLine();

        String[] array =sentence.split(" ");

        System.out.println("kelime sayısı : "+ array.length);


    }
}
