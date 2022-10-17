package day17;

import java.util.ArrayList;
import java.util.List;

public class C03arrayLists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(8);
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.add(3);

        // print without repetition

        List<Integer> numsNonRepeat = new ArrayList<>();

        for (int num : nums){
            if (!numsNonRepeat.contains(num)){
                numsNonRepeat.add(num);
            }
        }
        System.out.println(numsNonRepeat);
    }
}
