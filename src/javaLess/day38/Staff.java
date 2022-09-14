package javaLess.day38;

public class Staff {
    String status= "Personel";
    String rights= "Tüm personel eşit haklara sahiptir";
    String permissions= "Yılda 3 hafta izin yapılır";

    public void shift(){
        System.out.println("Tüm personel 5 gün, günde 8 saat çalışır");
    }

    public void wage(){
        System.out.println("Persone - 30 gün * 8 saat * 30 TL : "+(30*8*30)+" TL");
    }
}
