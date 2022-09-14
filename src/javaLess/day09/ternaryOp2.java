package javaLess.day09;

public class ternaryOp2 {
    public static void main(String[] args) {
        //verilen pozitif tam sayının
        // 2'den fazla basamaklı olup olmadığını kontrol et
        int sayi =0;
        System.out.println(sayi > 99 ? "ikiden fazla basamaklı" : "ikiden fazla basamaklı değil ya da negatif");

    String sonuc = sayi > 99 ? "ikiden fazla basamaklı" : "ikiden fazla basamaklı değil ya da negatif";
   //sonuç yazdırılabilir ya da atanabilir
        //data türleri farklıysa atama yapılamaz, yazdırılabilir
        System.out.println("analiz : " + sonuc);
    }
}
