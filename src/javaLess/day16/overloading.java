package javaLess.day16;

public class overloading {
    public static void main(String[] args) {
         String cümle="Cikolatali kekim bu alemde tekim";

         //bir class'ta aynı isimde birden fazla method varsa : overloading
         //parametre sayısı farklı olmalı ya da
         // argümentlerin data türleri farklı olmalı

        int num1 =4; double num3=4.4;
        int num2 =5; double num4=5.5;

        // iki sayıyı toplayan method oluştur
        addingMethod(num1,num2);

        //double
        addingMethod(num3,num4);
        //iki farklı data türü için aynı isimde farklı methodlar oluşturuldu

        //farklı data türleri eklendiğinde contain yapar ve uygun olanı seçer
        //int double method da olsa çalışır (en uygun olanı çalıştırır)
        addingMethod(num1,num3);

    
    
    }

    private static void addingMethod(double num3, double num4) {
        System.out.println("iki double toplamı : "+(num3+num4));
    }

    private static void addingMethod(int num1, int num2) {
        System.out.println("iki int toplamı : " +(num1+num2));
    }
}
