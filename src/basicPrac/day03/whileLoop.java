package basicPrac.day03;

public class whileLoop {
    public static void main(String[] args) {
        // 0-255 arası sayıları ve char değerlerini yazdır (while ile)

        int i = 0;
        while (i<=255){
            char c = (char) i;
            System.out.println("sayı : "+i+"  -  char karşılığı : "+c);
            i++;
        }
    }
}
