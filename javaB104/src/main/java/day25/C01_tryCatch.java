package day25;

public class C01_tryCatch {
    public static void main(String[] args) {

        divide2(4, 2);
        divide2(4, 0);
    }

    private static void divide2(int x, int y) {

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.err.println(e.getMessage()); // prints red
            e.printStackTrace(); // error message w details
        }
    }
}
