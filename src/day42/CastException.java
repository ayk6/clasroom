package day42;

public class CastException {
    public static void main(String[] args) {
        int num = 4;
        // String str = 4; CTE

        Object num2=10;
        // String str3= num2; CTE
        String str2 = (String) num2; // Explicit Narrowing
        // çalıştığında class cast exception verir
        // obje geniş küme, string'e indirgeyip int atarsak rtException verir




    }
}
