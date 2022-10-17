package day16;

public class C01mdArrays {
    public static void main(String[] args) {
        // sum md array elements
        int arr[][] = {{8, 5}, {9, 0, -6}, {1}};
        int sum = 0;

        for (int[] arr2 : arr) {
            for (int num : arr2) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
