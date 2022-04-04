package day33;

public class StringBuilder3 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Deneme Bir");
        StringBuilder sb2 = new StringBuilder("deneme bir");

        String str = "Deneme Bir";

        System.out.println(sb1.compareTo(sb2)); // -32
        // compare iki sb'i ilk harften başlayarak tüm karakterleri karşılaştırır
        // eşit mi kontrol eder. farklı olan ilk karakter için ascii değeri farkını yazar
        // tamamen aynı ise 0 yazdırır

        // sb ile string karşılaştırma yapılmaz

        System.out.println(sb1.insert(6," ilk")); // Deneme ilk Bir
        System.out.println(sb1.insert(0,str,0,10)); // Deneme BirDeneme ilk Bir

        System.out.println(sb2.reverse()); // rib emened

        System.out.println(sb1.equals(sb2)); // false
        // farklı objeleri false verir
        // string ile karşılaştırınca hata vermez ama aynı da olsa false döner
        // string ile sb == karşılaştırılmaz cte verir
    }
}
