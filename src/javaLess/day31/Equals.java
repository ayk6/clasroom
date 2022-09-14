package javaLess.day31;

public class Equals {
    public static void main(String[] args) {

        String str1 = "Asdf";
        String str2 = "Asdf";

        String str3 = new String("Asdf");

        String str4 = str1+"";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true

        System.out.println(str1==str2);  // true
        System.out.println(str1==str3);  // false
        System.out.println(str1==str4);  // false

        //    string değer hiç işlem yapmadan farklı variable'lara atanırsa
        // java heap memory'de az yer kaplamak için aynı objeye referans oluşturur

    }
}
