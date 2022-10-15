package day15;

import java.util.Arrays;

public class C02multidimensionalArrays {
    public static void main(String[] args) {
        int[][] mdArr=new int[3][2];

        mdArr[0][0]=1;
        mdArr[0][1]=2;
        mdArr[1]= new int[]{3, 4};
        mdArr[2]= new int[]{5, 6};

        System.out.println(Arrays.deepToString(mdArr));
        // [[1, 2], [3, 4], [5, 6]]
        System.out.println(Arrays.toString(mdArr[0]));
        // [1, 2]
        System.out.println(mdArr[0][0]);
        // 1

        for (int[]i :mdArr){
            for (int j:i){
                System.out.print(j+" "); // 1 2 3 4 5 6
            }
        }
    }
}
