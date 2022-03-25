package day26;

public class constructor {
    // main method yok
    // runner classta class oluşturduk
    // class oluştururken belirtmesek dahi java constructor oluşturur
    // DEFAULT CONSTRUCTOR, görünmez
    // görünür yapmak için default ile aynı işi yapan cosbtructor oluşturabiliriz
    // ya da farklı özelliklerde de oluşturabiliriz
    // constroctrları ayıran yalnızca parametre sayısı ve data türü

    public constructor() {
        System.out.println("parametresiz constructor çalıştı");

    }
    // method - constructor farkı
    // constructor ismi class ismi ile aynı olur
    // methodlarda return type vardır

    public constructor(String deneme){
        System.out.println("deneme çıktısı çalıştı");
    }
    public constructor(int deneme2) {
        System.out.println(deneme2 + "deneme2 çıktısı çalıştı");
    }

}
