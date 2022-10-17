package day16;

public class C03mdArrays {
    public static void main(String[] args) {
        // sum of max & min elements

        int[][] arr = {{8, 5}, {9, 0, -6}, {1}};
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for (int[] ints:arr){
            for (int anInt:ints){
                max=Math.max(max,anInt);
                min=Math.min(min,anInt);
            }
        }
        System.out.println(max+min);
    }
}
