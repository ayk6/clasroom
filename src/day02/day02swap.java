package day02;

public class day02swap {
    public static void main(String[] args) {
        String nameSurname="Ahmet Yasin KARACA";
        int age = 28 ;
        String name = "Ahmet Yasin";
        String surname = "KARACA";
        double length = 1.71;
        char mOrF = 'E';
        System.out.println("İsim : " + name);
        System.out.println("Soyisim : " + surname);
        System.out.println("Boy - Cinsiyet : "+length + " - "+mOrF);


        short aykAge = 28;
        double age2 = 15.5;
        System.out.println(aykAge + age2 );

        int sayı1 = 10;
        char harf = 'a';
        int ASCIIa= 'a';
        System.out.println(ASCIIa);
        System.out.println(sayı1+harf);
        //char karakteri matematiksel işleme girerse ASCII tablosundaki karşılık değerini alır
        //int datasına harf vs atarsan ASCII değerini alır

        //swap programı
        int swap1=2;
        int swap2=4;
        System.out.println("swap Öncesi sayı 1: " + swap1 + "   sayı 2: " + swap2);
        //3. bir yer gerekli ki yerler değişsin
        // geçici değişken oluşturacağız temp: geçici

        int temp = swap1;//swap 1 yedeklendi
        swap1=4; temp=swap2; swap2=2;
        System.out.println("swap sonrası 1 : " +swap1 + "  2 : "+ swap2);

        //3. değişken kullanmadan swap

        int swapp1=4;
        int swapp2=5;
        System.out.println("swap Öncesi sayı 1:" + swapp1 + "  sayı 2 : " +swapp2);

        swapp1=swapp2+swapp1; swapp2=swapp1-swapp2; swapp1=swapp1-swapp2;
        System.out.println("swap sonrası sayı 1:" + swapp1 + "  sayı 2 : " +swapp2);
        




    }
}
