package javaLess.day12;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        //ikame etme
        //String karakter(ler) istenen karakter(ler) ile değiştirilir
        //char da kabul eder

        //cümledeki boşluk dışındaki karakter sayısını bul

        String sentence = "Replace deneme cümlesi.";
        System.out.println(sentence.replace(" ","").length());
        //boşlukları sildi ve uzunluğu yazdırdı -21
        //kalıcı olarak silmedi
        //yalnızca istenen satırda sildei ve ölçtü
        System.out.println(sentence.length()); //-23

        //kalıcı olması için atama gerekir
        sentence=sentence.replace("cümlesi", "cümlesi 2");
        System.out.println(sentence);

        //replaceAll
        //string içindeki bütün karakter(ler)i istenen(ler)le değiştirir
        //char kabul etmez
        System.out.println(sentence.replaceAll("\\S","*"));

        /* \\s: boşluk,
            \\S: boşluk dışında tüm karakterler
            \\w: harfler ve rakamlar
            \\W: harfler ve rakamlar dışındakiler
            \\d: rakamlar
            \\D: rakamlar dışındaki tüm karakterler */

        //kullanıcıdan isim soyisim al ve harfleri sansürle
        System.out.println("isim yazın");
        Scanner scan = new Scanner(System.in);
        String isim= scan.nextLine();
        System.out.println(isim.replaceAll("\\S","*"));



    }
}
