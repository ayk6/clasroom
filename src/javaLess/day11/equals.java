package javaLess.day11;

import java.util.Locale;

public class equals {
    public static void main(String[] args) {
        //EQUALS - verilen iki string aynı mı kontrol eder
        //aynıysa TRUE dönder, değilse FALSE
        //harf büyük küçük duyarlı
        //equals() içeriğe, == içeriğe ve adrese(reference) bakar
        String  srt1="Ahmet Yasin";
        String str2="Ahmet" + " Yasin";
        //ikisinin de sonucu aynı, equals ile karşılaştırılırsa TRUE
        //== ile FALSE çünkü adresleri farklı

        System.out.println("equals ile karşılaştır : "+ srt1.equals(str2) );
        System.out.println(" == ile karşılaştır : " + (srt1==str2));

        String str3=str2+"";
        System.out.println(str3);
        System.out.println("equals ile karşılaştır : "+ srt1.equals(str3) );
        System.out.println(" == ile karşılaştır : " + (srt1==str3));

        //== string'de her zaman doğru sonuç vermez, equals tercih edilir

        String str4="ayk";
        String str5="AYK";
        System.out.println(str4.equals(str5));//false
        System.out.println(str4.toUpperCase(Locale.ROOT).equals(str5)); //true

    }
}
