package lambda.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4, -5, 0, 6, -4, 1, 7, 3, 2));
        // çift sayıların karelerini yazdır
        // tek sayıların küpünün bir fazlasını yazdır
        // çiftlerin karekökünü yazdır
        // en büyük elemanı yazdır
        // sayıları topla
        methodEven(nums);
        System.out.println("");
        methodOdd(nums);
        System.out.println("");
        method3(nums);
        System.out.println("");
        methodBiggest(nums);
        methodPlus(nums);
        methodMultip(nums);
    }

    public static void methodEven(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).map(t -> t * t).forEach(lambda.day01.C01::printt);
        // stream içerisindeki elemanları dönüştürmek ya da işlem yapmak
        // için map kullanılır
    }

    public static void methodOdd(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t * t + 1).forEach(lambda.day01.C01::printt);
    }

    public static void method3(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).map(Math::sqrt).
                forEach(t -> System.out.print(t + " "));
    }

    public static void methodBiggest(List<Integer> nums) {
        System.out.println(nums.stream().reduce(Math::max));
        Optional<Integer> maxNums=nums.stream().reduce(Math::max);
        System.out.println(maxNums);
        // sonuç çıkmama ihtimaline karşın int ataması yapılmaz
        // optional olarak atama yapılabilir
    }
    public static void methodPlus(List<Integer> nums) {
        System.out.println(nums.stream().reduce(Integer::sum));
        System.out.println(nums.stream().reduce(0, (a, b) -> a + b));
        // a ilk olarak atanan değeri (identity[0]), b ise akıştan gelir
        // işlemi yapınca her seferinde sonucu a'ya atar
    }
    public static void methodMultip(List<Integer> nums) {
        System.out.println(nums.stream().reduce(1,(a,b)->a*b));
        System.out.println(nums.stream().reduce(Math::multiplyExact));
    }
}
