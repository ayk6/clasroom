package javaLess.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listToArray {
    public static void main(String[] args) {
        //verilen list'i array yap

        List<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("asd");
        System.out.println(list); // [qwe, asd]
        // ilk çözüm
        String array[]=list.toArray(new String[0]);
        System.out.println(Arrays.toString(array)); //[qwe, asd]

        //ikinci çözüm
        List<String> list2 = new ArrayList<>();
        list2.add("zxc");
        list2.add("fgh");
        System.out.println(list2); // [zxc, fgh]
        Object[] array2=list2.toArray();
        System.out.println(Arrays.toString(array2)); // [zxc, fgh]
    }
}
