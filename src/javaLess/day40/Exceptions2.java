package javaLess.day40;

public class Exceptions2 {
    public static void main(String[] args) {
        // String sayıyı int çevir ve yazdır

        String str = "31415a";

        // System.out.println(num);
        // String içinde saı dışında karakter olduğu için exception verir
        // for input string exceptions

        // try catch ile çözülebilir

        try {
            int num = Integer.parseInt(str);
            System.out.println("sayı : "+num);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("hatalı veri");
        }
        // exception yerine "hatalı veri" yazdırır

    }

}
