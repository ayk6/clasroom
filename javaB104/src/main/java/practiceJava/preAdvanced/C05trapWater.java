package practiceJava.preAdvanced;

public class C05trapWater {
    public static void main(String[] args) {

        //                                *
        //                    *           *  *     *
        //          |   *     *  *     *  *  *  *  *  *|
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 0, 0};
        int result = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right = Math.max(right, arr[j]);
            }
            result += Math.min(left, right) - arr[i];
        }
        System.out.println(result);
    }
}
