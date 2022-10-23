package day18;

public class C03varargs {
    public static void main(String[] args) {
        int num1 = 4, num2 = 3, num3 = 14;
        String str ="";
        add(num1, num2); // 7
        add(num1, num2, num3); // 21
        add(str,num1,num2);

        // varargs method(<data type>... name){} or <data type> ...name
        // can be used with different pieces of data
        // works like arrays
        // Vararg parameter must be the last in the list
        // cannot be used more than once in a method
    }

    private static int add(int... nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        return sum;
    }
    private static int add(String str, int ...nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        return sum;
    }
}
