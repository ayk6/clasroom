package javaLess.day04;

public class Increment {
    public static void main(String[] args) {
        //değişken değeri artırma
        int sayi1 = 4;
        sayi1=sayi1+3; //sayi1 7 olur
        System.out.println(sayi1);
        sayi1=4;
        System.out.println(sayi1);

        sayi1+=3; // pratik yöntem
        System.out.println(sayi1);

        //diğer işlemlerde de çalışır
        sayi1*=3;
        System.out.println(sayi1);
        sayi1=4;
        sayi1++; //bu da 1 artır demektir
        System.out.println(sayi1);
        sayi1--; //bir eksilt demek
        System.out.println(sayi1);

        sayi1=10;
        System.out.println(sayi1=sayi1+=5);
        //bu işlem değeri artırır ve yazdırır
        System.out.println(sayi1);
        System.out.println(sayi1+=5); //değeri artırır ve yazdırır
        System.out.println(sayi1+5); //yalnızca yazdırılanı artırır,değer aynı
        sayi1=10;
        System.out.println(sayi1++); //artırdı ama aynı yazdırdı? 10
        System.out.println(sayi1);  //11

        sayi1=10;
        System.out.println(++sayi1); //artırarak yazdırdı??


    }
}
