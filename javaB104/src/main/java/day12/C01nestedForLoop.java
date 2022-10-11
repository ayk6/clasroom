package day12;

public class C01nestedForLoop {
    public static void main(String[] args) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5   print

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // * * * *
        // * * *
        // * *
        // *   print

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
