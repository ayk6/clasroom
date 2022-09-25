package day03;

public class C01typeCasting {
    // small to large -> auto widening
    // large to small -> explicit narrowing

    public static void main(String[] args) {
        byte aBtye = 100;
        int newByte = aBtye; // auto widening

        long aLong =1234;
        int newLong = (int) aLong; // explicit narrowing

        int num = 260;
        byte newNum = (byte) num;
        System.out.println(newNum); // 4
        // when the limit is exceeded, calculation is made with modular arithmetic


    }
}
