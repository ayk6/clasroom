package day26;

import java.util.ArrayList;
import java.util.List;

public class forEachLoop2 {
    public static void main(String[] args) {

        //10 elementli list oluştur
        int array[]={1,2,3,4,5,6,7,8,9,10};
        List<Integer> numbers = new ArrayList<Integer>();

        for (int each: array
             ) {
            numbers.add(each);
        }
        System.out.println(numbers);

        //list'teki 3'e bölünemeyen sayıları for-each ile yazdır

        for (int each:numbers
             ) {
            if (each%3 !=0 ){
                System.out.print(each + " ");
            }

        }
    }
}
