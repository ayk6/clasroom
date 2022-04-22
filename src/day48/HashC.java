package day48;

import java.util.HashSet;
import java.util.Set;

public class HashC {
    public static void main(String[] args) {
        // hash code'da önemli olan aynı elemanlara aynı,
        // farklı elemanlara farklı hash code vermesidir

        String str = "Hash deneme cümlesi";
        System.out.println(str.hashCode()); // 1992266949

        String str2 = "Hash 2. deneme cümlesi";
        System.out.println(str2.hashCode()); // 1444450181

        String str3="";
        System.out.println(str3.hashCode()); // 0

        Set<Integer> nums = new HashSet<>();
        System.out.println(nums.hashCode()); // 0

        nums.add(4);
        System.out.println(nums.hashCode()); // 4

        nums.add(14);
        System.out.println(nums.hashCode()); // 18


    }
}
