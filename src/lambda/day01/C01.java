package lambda.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4,18,29,12,65,82,7,34,20));

        StructuredPrint(nums); // 4 18 29 12 65 82 7 34 20
        System.out.println("");
        FunctionalPrint(nums); // 4 18 29 12 65 82 7 34 20
        System.out.println("");
        EvenFunctionalPrint(nums); // 4 18 12 82 34 20
    }
    // Structured Programming ile list elemanlarını aralarında boşluk ile yazdır
    public  static void StructuredPrint (List<Integer>nums){
        for (Integer each:nums) {
            System.out.print(each+" ");
        }
    }

    // Functional Programming kullanarak yazdır
    public  static void FunctionalPrint (List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t+" "));
        nums.forEach(t-> System.out.print(t+" ")); // aynı şekilde çalıştı?
    }
    // çift olanları boşluk ile yazdır
    public static void EvenFunctionalPrint(List<Integer>nums){
        nums.stream().filter(t->t%2==0).forEach(C01::printt);
    }
    public  static void printt (int a){
        System.out.print(a+" ");
    }

}
