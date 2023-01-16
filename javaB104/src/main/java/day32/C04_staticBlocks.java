package day32;

public class C04_staticBlocks {
    // static blocks work first, before even main methods
    // only static variables can be assigned in a static block.

    public static double pi;

    static {pi = 3.14;}

    public static void main(String[] args) {

    }
}
