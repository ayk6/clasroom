package day04;

public class ExplicitNarrowing {
    public static void main(String[] args) {
        //kontrollü daraltma
        //AutoWidening yaparken büyük datayı küçük dataya çevirememiştik

        int sayi1=444;
        double sayi2=10;

        double sayi3 = sayi1/sayi2; //44,4 verir
        System.out.println(sayi3);

        //int sayi4=sayi1/sayi2 çalışmaz, double int e çeviremez
        //burada manuel çevirme gerekli
        int sayi4=(int)(sayi1/sayi2); //şeklinde kontrolü ve sorumluluğu alarak çevirebiliriz
        System.out.println(sayi4); //44 int sonuç verir

        int sayi5=sayi1/(int)sayi2; //çalışır

        int sayi6=440;
        //byte sayi7=sayi6 çalışmaz int>byte
        byte sayi7=(byte)sayi6; //çalışır
        System.out.println(sayi7); // -72 verdi çünkü üst sınıra ulaştıkça alt sınırdan devam eder
        //2üzeri7-1 olunca -2üzeri7 den tekrar başa döner byte


    }
}
