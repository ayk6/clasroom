package day11;

import java.util.Locale;
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        //String uzunluğunu verir (length-1 son karakteri verir)
        System.out.println("İSMİNİZİ YAZIN");
        Scanner scan = new Scanner(System.in);
        String isim= scan.nextLine();
        System.out.println(isim.length()); //5
        //ismin ilk ve son harfini yazdır (büyük harf)
        System.out.println("İsmin ilk harfi : "+
                isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0)+"\n"+
                "İsmin son harfi : "+
                isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str2=null;
        System.out.println(str2);
        // System.out.println(str2.length()); // calistirildiginda hata verir
        String str3;
        // System.out.println(str3);
        // str3 ile str2'ye deger atanmamistir
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez
    }
}
