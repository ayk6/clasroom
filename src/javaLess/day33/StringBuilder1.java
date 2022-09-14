package javaLess.day33;

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("asdfghadadsa");
        StringBuilder sb3 = new StringBuilder(4); // 4 karakter uzunluğunda

        System.out.println(sb1.length()); // uzunluğu verir - 0
        System.out.println(sb1.capacity()); // 16 kaç karakterlik yer açıldığını verir
        System.out.println(sb2.capacity()); // 30 kaç karakterlik yer açıldığını verir
        System.out.println(sb3.capacity()); // 4 kaç karakterlik yer açıldığını verir

        // append method'u ile ekleme yapılabilir

        sb1.append("deneme").append(" ").append("cümlesi").append(1).append(false);
        System.out.println(sb1 + " "+ sb1.capacity()); // deneme cümlesi1false 34

        sb2.trimToSize();
        System.out.println(sb2.capacity()); //12
        // boş kapasiteyi siler
    }
}
