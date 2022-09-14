package javaLess.day27;

public class constructor {
    public static void main(String[] args) {

        constructor02 obj1 = new constructor02(); //default const. devrede
        // 02 classında hiç constructor yokken çalıştı
        // 02'de parametreli ya da parametresiz const. oluşturduğumuzda
        // default devre dışı kalır.
        // buradaki parametresiz olduğu için
        // bağlı classta da aynı şekilde olmalı

        constructor02 obj2 = new constructor02("asd");

        // buradaki cons. parametreli olduğunda karşılığı da olmalı

    }

}
