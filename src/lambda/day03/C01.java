package lambda.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {
    // List elemanlarından en küçüğünü 4 farklı yol ile yazdır.
    // int, math, lambda, method
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4, -5, 0, 7, 3, 2));
        intPrint(nums);
        mathPrint(nums);
        lambdaPrint(nums);
        System.out.println(nums.stream().reduce(C01::methodPrint));
    }
    public static void intPrint(List<Integer> nums){
        System.out.println(nums.stream().reduce(Integer::min));
    }
    public static void mathPrint(List<Integer> nums){
        System.out.println(nums.stream().reduce(Math::min));
    }
    public static void lambdaPrint(List<Integer> nums){
        System.out.println(nums.stream().reduce(Integer.MAX_VALUE,(x,y)-> x<y?x:y));
    }
    public static int methodPrint(int a, int b){
        return a<b?a:b;
    }
}
