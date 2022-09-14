package javaLess.day38;

public class Foreman extends Worker{
    String status= "Ustabaşı";
    String rights= "Ustabaşı 2 kat ücret alır";

    public void shift(){
        System.out.println("Ustabaşı haftada 6 gün çalışır");
    }

    public void wage(){
        System.out.println("Ustabaşı - 30 gün * 8 saat * 60 TL : "+(30*8*60)+" TL");
    }

    public static void main(String[] args) {
        Foreman f1 = new Foreman();
        System.out.println(f1.status); // ustabaşı
        System.out.println(f1.rights); // Ustabaşı 2 kat ücret alır
        System.out.println(f1.bonus); // İşçiler yılda bir ikramiye alır
        System.out.println(f1.permissions); // Yılda 3 hafta izin yapılır
        // obje oluşturduğumuzda variable ve methodlarda önce bulunan class'a bakar
        // yoksa parent'a geçer, orada da bulamazsa üst parent'lara ilerler
        // ilk bulduğunu kullanır
        f1.wage(); // Ustabaşı - 30 gün * 8 saat * 60 TL : 14400 TL
        f1.shift(); // Ustabaşı haftada 6 gün çalışır



        Worker f2 = new Foreman();
        System.out.println(f2.status); // işçi
        System.out.println(f2.rights); // işçiler ek ödeme alır
        System.out.println(f2.bonus); // İşçiler yılda bir ikramiye alır
        System.out.println(f2.permissions); // Yılda 3 hafta izin yapılır
        // doğrudan parent class özelliklerini getirmek istersek
        // class ismini parent class olarak seçeriz
        f2.wage(); // Ustabaşı - 30 gün * 8 saat * 60 TL : 14400 TL
        f1.shift(); // Ustabaşı haftada 6 gün çalışır

        Staff f3 = new Foreman();
        System.out.println(f3.status); // Personel
        System.out.println(f3.rights); // Tüm personle sşit haklara sahiptir
        // System.out.println(f3.bonus); personel class'ında bonuz tanımlı değil
        System.out.println(f3.permissions); // Yılda 3 hafta izin yapılır
        // Bir obje tanımlandığı class'ın özelliklerini kazanır
        f3.wage(); // Ustabaşı - 30 gün * 8 saat * 60 TL : 14400 TL

        // Staff f3 = new Staff(); staff objesi
        // Staff f3 = new Foreman(); foreman objesi
        // f3 ustabaşı ama staff variable ile çağırdığımızda staff özelliklerini
        // kullanmak için çağırırız
        // methodlarda ise sağdaki const. çalışır
        // staff variable olsa da const foreman ise foreman methodları kullanır

    }
}
