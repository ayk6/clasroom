package lambda.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList(
                "ilkEleman", "iki", "üç", "dört", "dört", "sonElemann"));
        // çift sayı uzunluğundakilerin uzunluk karelerini büyükten küçüğe tekrarsız yazdır
        evenPow(strList);
        System.out.println("");
        // uzunlukları 7'den kısa olan var mı kontrol
        isLongerTh7(strList);

        // match metodları tüm elemanları kontrol edip boolean döndürür
        // allMatch()  ve gibi çalışır
        // anyMatch()  veya gibi çalışır
        // noneMatch() hiçbir şart sağlanmazsa true, biri dahi sağlarsa false

        // w ile başlayan var mı? anyMatch
        isStatrtW(strList);
        // x ile biten var mı? noneMatch
        isEndX(strList);
        // en uzun elamanı yazdır
        longestElement(strList);
        // skip(x) x tane elamanı atlar kalan elemanlardan akış döndürür
        // son harfe göre sırala ve ilki dışında tüm elamanları yazdır
        lastLetter(strList);
        System.out.println("");
        // limit(x) x. elemana kadar elemanları alır ve akış döndürür
        // toArray ile ya da toList ile de yeni akış (stream) kullanılabilir
        firstThree(strList);
    }

    public static void evenPow(List<String> strList) {
        strList.stream().map(t->t.length()*t.length()).distinct().filter(t->t%2==0)
                .sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }
    public static void isLongerTh7(List <String> strList){
        boolean ctrl = strList.stream().allMatch(t->t.length()<=7);
        if (ctrl){
            System.out.println("7 harften az ya da 7 harf");
        }
        else System.out.println("7 harften fazla");

        System.out.println(strList.stream().allMatch(t -> t.length() <= 7) ? "7 harften az lmb" :
                "7 harften fazla lmb");
    }
    public static void isStatrtW(List<String> strList){
        System.out.println(strList.stream().anyMatch(t -> t.startsWith("w")) ?
                "w ile başlayan eleman var" : "w ile başlayan eleman yok");
    }
    public static void isEndX(List<String> strList){
        System.out.println(strList.stream().noneMatch(t->t.endsWith("x"))?
                "x ile biten eleman yok":"x ile biten eleman var");
    }
    public static void longestElement(List<String> strList){
        System.out.println(strList.stream().sorted(Comparator.comparing(t -> t.toString().length())
                .reversed()).findFirst());
    }
    public static void lastLetter (List<String> strList){
        strList.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)))
                .skip(1).forEach(t-> System.out.print(t+" "));
    }
    public static void firstThree (List<String> strList){
        strList.stream().limit(3).forEach(t-> System.out.print(t+" "));
    }
}
