package javaLess.day05;

public class WrapperClass {
    public static void main(String[] args) {
        //wrapperClass değişken atadığımızda değişken. yazarsak seçenekler çıkar
        //koyu olanlar kullanılabilir
        String degisken= "qwerty";
        // örndegisken.toUpperCase(Locale.ROOT) büyük harf yapar
        //non-primitive datalar buna izin verir
        //primitive daha çok saklamak için
        //primitive dataları non-primitive olarak kullanabilmek için class'lar vardır
        //bunlara Wrapper Class denir

        double sayi=10.0; //sayi. yaparsak seçenek vermez
        Double sayi2=10.1; // bu şekilde kullanırsak seçenekler çıkarır
        //Double datası Wrapper Class'lardan birisi
        //primitive ile wrapper class ı np arasında geçiş yapılabilir

        sayi=sayi2; //hata vermedi

        System.out.println(Integer.MAX_VALUE); //int max değeri gösterir
        //min vlue min değer, BYTES kaç byte oldğunu gösterir

        String str1="12345"; String str2="54321";
        //bunları toplayabilir miyiz?

        System.out.println(str1 + str2); // yan yana yazar
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        //bu şekilde string sayısal değere dönüşür ve toplama yapar
        //sayısal değer dışında bir tane bile değer olsa hata verirdi


    }
}
