package practiceJava.day01;

import java.util.ArrayList;
import java.util.List;

public class C01list {
    public static void main(String[] args) {
        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(50);
        nums.add(23);
        nums.add(200);
        nums.add(18);
        nums.add(20);
        nums.add(23);
        nums.add(185);
        System.out.println(nums);

        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println(nums);

        Integer num = 200;
        nums.remove(num);

        System.out.println(nums);
    }
}
