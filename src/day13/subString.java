package day13;

public class subString {
    public static void main(String[] args) {
        String str= "İlk deneme cümlesi";

        System.out.println(str.substring(4));
        //4. karakterden itibaren yazdırır (4 dahil)
        System.out.println("İkinci"+str.substring(3));
        //"ikinci deneme cümlesi" olarak değişti

        System.out.println(str.substring(4,10));
        //4. karakterden (dahil) 10. karaktere kadar (hariç) yazdırır

        //cümledeki 5. harfi bul
        System.out.println(str.charAt(4)); //char olarak yazdırır
        System.out.println(str.substring(4,5)); // string yazdırır
        String harf = str.substring(4,5); //string atama yapılabilir
        System.out.println(harf);

        System.out.println(str.substring(5,5)); //"" hiç yazdırır
        //str.substring(5,4) hata verir
        System.out.println(str.substring(18));
        //son indexten bir fazlası hiçlik yazdırır
        //son indexten 2+ fazla girilirse hata verir

        System.out.println(str.substring(str.length()-1));
        //son harfi yazdırır
    }
}
