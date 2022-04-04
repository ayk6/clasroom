package day33;

public class StringBuilder2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("deneme cümlesi");

        System.out.println(sb1.indexOf("cümle")); // 7
        System.out.println(sb1.lastIndexOf("e")); // 11

        System.out.println(sb1.replace(0,0,"yeni "));
        // yeni deneme cümlesi
        // değiştirilene atama da yapar
        // String builder mutable

        System.out.println(sb1.toString().toUpperCase());
        // YENİ DENEME CÜMLESİ
        // stringe çevirir ve tüm string özellikleri kullanılabilir

        System.out.println(sb1); // yeni deneme cümlesi
        // toString ile yapılan değişiklik kalıcı olmaz
        // strin unmutable

        System.out.println(sb1.delete(0,5)); // deneme cümlesi

        System.out.println(sb1.deleteCharAt(6)); // denemecümlesi,





    }
}
