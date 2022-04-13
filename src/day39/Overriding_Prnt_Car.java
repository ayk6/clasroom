package day39;

public class Overriding_Prnt_Car {
    String movement="Motor itiş gücü ile hareket ederler";
    String speed="Motor gücü hızı belirler";
    String fuel="Yakıt türü modele göre değişir";
    String model="Her marka ürettiği aracın modelini belirler";

    public void engine() {
        System.out.println("Her model farklı motor kullanır");
    }
    public void fuelPerMiles(){
        System.out.println("Yakıt tüketimi motor gücü ve yakıt türüne bağlıdır");
    }
}
