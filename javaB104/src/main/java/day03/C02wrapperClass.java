package day03;

public class C02wrapperClass {
    public static void main(String[] args) {
        // wrapper classes are data types that contain methods

        // byte     -> Byte
        // short    -> Short
        // int      -> Integer
        // long     -> Long
        // float    -> Float
        // double   -> Double
        // boolean  -> Boolean
        // char     -> Character

        Byte wrapperByte = 4;
        System.out.println(wrapperByte.hashCode());

        byte primitiveByte = 4;
        System.out.println(Byte.toString(primitiveByte));

        System.out.println(Byte.MAX_VALUE);

        double aDouble = 123;
        Double wrapperDouble = aDouble; // autoboxing
        double newDouble = wrapperDouble; // unboxing
    }
}
