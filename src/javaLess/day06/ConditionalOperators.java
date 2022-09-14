package javaLess.day06;

public class ConditionalOperators {
    public static void main(String[] args) {
        //Şart (mantık) operatörleri
        //&& AND (ve) işareti tüm ifadeler doğru ise true
        //bir ifade dahi yanlış olsa false

        //&& ile & farkı; && ilk yanlışta sonuç verir
        //& tüm ifadeleri test eder ve yavaşlatır

        boolean test1=(5+2==7)&&(4+3!=8);
        System.out.println(test1); //true

        boolean test2=(5+2==7)&&(4+3>=8);
        System.out.println(test2); //false

        // || OR (veya) işareti
        // bir ifade dahi doğru olsa true
        // yalnızca tüm ifadeler yanlışsa false olur

        boolean test3=(5+2==7)||(4+3>=8);
        System.out.println(test3); //true

        // java üçlü karşılaştırma yapmaz 1<2<3 olmaz
        //1<2 && 2<3 olmalı

        int num1=7; // num1 in 10 ile 30 arasında olmadığını test edelim
        System.out.println(num1<10 || num1>30);



    }

}
