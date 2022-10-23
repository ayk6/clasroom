package day18;

public class C04methodOverloading {
    public static void main(String[] args) {
        // same method name but different parameters

        add(3,5); // first method
        add(3,5.0); // 2nd
        add(3.0,5.0); // 3rd
        add(3.0,5); // 4th

        // if there is no exact match, can be auto widening

    }

    private static void add(int i, int i1) {
    }
    private static void add(int i, double i1) {
    }
    private static void add(double i, int i1) {
    }
    private static void add(double i, double i1) {
    }
}
