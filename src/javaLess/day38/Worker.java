package javaLess.day38;

public class Worker extends Staff{
    String status= "İşçi";
    String rights= "İşçiler ek ödeme alır";
    String bonus= "İşçiler yılda bir ikramiye alır";

    public void shift(){
        System.out.println("İşçiler haftada 40 saat çalışır");
    }

    public void wage(){
        System.out.println("İşçi - 4 Hafta * 40 Saat * 40 TL : "+(4*40*40)+" TL");
    }
}
