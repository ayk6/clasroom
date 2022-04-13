package day39;

public class Auris extends Toyota{
    String speed="Auris max 240 km hıza ulaşır";
    String model="Auris";
    String fuel="Benzin";
    String hp="124";

    // objeler oluştuğu class ın özelliklerini taşır ama
    // variable'ları data türünün seçildiği class ya da parent'lardan alır
    // methodlarda ise önce override kontrol eder
    // OVERRİDE: parent'larda olan methodu aynı isimle child'larda oluşturmak

    public void engine() {
        System.out.println("1.6 motor");
    }
    public void fuelPerMiles(){
        System.out.println("6 L / 100 km");

    }
    public void gearType(){
        System.out.println("yarı otomatik");
    }

    public static void main(String[] args) {
        Auris car1 = new Auris();
        System.out.println(car1.movement); // Motor itiş gücü ile hareket ederler
                                            // parent class'tan aldı
        System.out.println(car1.speed); // Auris max 240 km hıza ulaşır
        System.out.println(car1.origin); // Japonya
        System.out.println(car1.fuel); // Benzin
        System.out.println(car1.hp); // 124
        car1.engine(); // 1.6 motor

        Toyota car2 = new Auris(); // bilgileri toyota class'ından alır
        System.out.println(car2.movement); // Motor itiş gücü ile hareket ederler
                                             // parent class'tan aldı
        System.out.println(car2.speed); // Toyota max 260 km hıza ulaşır
        System.out.println(car2.origin); // Japonya
        System.out.println(car2.fuel); // Yakıt türü modele göre değişir
        // System.out.println(car2.hp); kendi class'ında ya da üstünde hp ataması yok CTE
        car2.engine(); //1.6 - override
        // car2.gearType(); parentta olmadığı için çalışmaz

    }
}
