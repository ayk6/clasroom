package javaLess.day09;

public class nestedTernary {
    public static void main(String[] args) {
        // verilen sayı 0 ya da pozitif mi negatif mi kontrol et
        //0 ya da pozitif ise tek ya da çift
        //negatif ise -10 dan küçük ya da değil

        int sayi =-9;

        String sonuc = sayi>=0 ?
                (sayi%2==0?"sayı çift ve pozitif ya da 0":"sayı tek ve pozitif")
                :
                (sayi<-10?"sayi negatif ve -10 dan küçük":"sayi negatif ve -10 dan büyük ya da eşit");

        System.out.println(sonuc);


        if (sayi>=0){
            if (sayi%2==0) System.out.println("sayı çift ve pozitif ya da 0");
            else System.out.println("sayı tek ve pozitif");
        } else {
            if (sayi<-10) System.out.println("sayi negatif ve -10 dan küçük");
            else System.out.println("sayi negatif ve -10 dan büyük ya da eşit");
        }

    }
}
