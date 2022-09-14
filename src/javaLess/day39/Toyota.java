package javaLess.day39;

public class Toyota extends Overriding_Prnt_Car{
    String speed="Toyota max 260 km hıza ulaşır";
    String model="Araç modelini toyota belirler";
    String origin="Japonya";

    public void engine() {
        System.out.println("Toyota motoru kullanır");
    }
    public void fuelPerMiles(){
        System.out.println("Yakıt tüketimi motor gücü ve yakıt türüne bağlıdır");

    }
    public void warranty(){
        System.out.println("Toyota araçlar 5 yıl garantilidir");
    }
}
