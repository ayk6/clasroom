package basicPrac.day03;

public class forLoop {
    public static void main(String[] args) {
        // 0-255 arası sayıları ve char değerlerini yazdır

        for (int i = 0; i <=255;i++){
            char c = (char) i;
            System.out.println("sayı : "+i+"  -  char karşılığı : "+c);
        }
    }
}
