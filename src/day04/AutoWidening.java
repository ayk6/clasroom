package day04;

public class AutoWidening {
    public static void main(String[] args) {
        int sayi1= 455;
        int sayi2= 10;

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);
        //iki int bölünürse küsratı siler int verir.
        //10 a bölerek son rakamları silebiliriz

        double sayi3=10;
        //sayi1=sayi1/sayi3; yaparsak çalışmaz
        //büyük olan datayı (double) küçük olanın içine(int) atamaz
        //sout olarak çıkartırsak işlem sonucunu verir , autowidening yapar ama değişken atayamaz


    }
}
