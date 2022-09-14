package javaLess.day30;

public class PassByValueOrReference {
    public static void main(String[] args) {

        double value=100;
        discount10percent(value); // 90
        discount10percent(value); // 90
        System.out.println(value); // 100

        // method içinde %10 indirdi ama etiket fiyatı değişmedi

    }

    private static void discount10percent(double value)
        // parantez içine farklı bir şey de yazılsa value algılar
        // buradaki value local, asıl value kullanmak istersek class level'da oluştururuz
        // methoda value eklediğimizde değerini kullanır (100)
        // farklı isim kullanılsa da aynı değeri kullanır
        // java pass by value kullanır
    {
        value=value*0.9;
        System.out.println("new prize (%10 discount) : " + value);
    }
}
