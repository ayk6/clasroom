package practiceJava.others;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Stair Steps : ");
        int stair = scan.nextInt();

        if (stair < 1 || stair > 45) {
            throw new Exception("stair steps must be 1<=stairSteps<=45");
        }
        System.out.println(stepCount(stair));

    }

    private static int stepCount(int stair) {
        if (stair == 0) return 1;
        if (stair < 0) return 0;
        return stepCount(stair - 1) + stepCount(stair - 2);
    }
}
