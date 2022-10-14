package day13;

import java.util.Arrays;
import java.util.Scanner;

public class C01arrays {
    public static void main(String[] args) {

        int[] arr  = {1,5,6,8,2,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        System.out.println(sum);

        char[] chArray ={'a','A','s','D','c','Z','-'};
        // print uppercase letters
        for (char ch:chArray) {
            if (ch>='A' && ch<='Z'){
                System.out.print(ch+ " ");
            }
        }
    }
}
