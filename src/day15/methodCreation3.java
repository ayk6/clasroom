package day15;

public class methodCreation3 {
    public static void main(String[] args) {
        int x=4;
        int y=4;

        // iki sayı toplama metodu oluştur

        ikiSayiToplama(x, y);
        ikiSayiToplama(10,15);

    }

    private static void ikiSayiToplama(int x, int y) {
        System.out.println("sayılar toplamı : "+ (x + y));
    }
}
