package day32;

import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time); // oluşturulan saat

        int num=0;
        for (int i = 0; i <100000 ; i++){
            num +=i;
        }

        System.out.println(time);   // ikisi de aynı saati verir.

        LocalTime time2 = LocalTime.now();
        System.out.println(time2);
        // işlemden sonraki anı verir

        double nano1 = time.getNano();
        double nano2 = time2.getNano();
        System.out.println(nano2-nano1); // işlemin kaç ns sürdüğünü verir

        // ileri ya da geri gidilebilir
        System.out.println(time.plusMinutes(900));

    }
}
