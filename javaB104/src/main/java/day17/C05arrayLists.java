package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C05arrayLists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(34);
        nums.add(13);
        nums.add(64);
        nums.add(-8);
        nums.add(18);
        nums.add(5);

        // print closest elements
        int diff = Integer.MAX_VALUE;
        Collections.sort(nums);

        for (int i = 1; i < nums.size(); i++) {
            diff = Math.min(diff, nums.get(i) - nums.get(i - 1));
        }

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == diff) {
                System.out.println(nums.get(i - 1) + "\t" + nums.get(i));
            }

        }
        List<String> isimler =new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Ömer");

        isimler.removeIf(w -> w.toLowerCase().contains("a"));
        System.out.println(isimler);
    }
}
