package advancedPrac.day03;

import java.util.Locale;
import java.util.Scanner;

public class ticketCost {
    public static void main(String[] args) {
        //Bilet fiyatı hesabı = Her 20 Km başına 5 euro.
        //kişi sayısı ekle, ödeme, ücret, para üstü yazdır
        Scanner scan = new Scanner(System.in);
        System.out.print("İstanbul 300km, Ankara 200 km (50km için 20 TL ücretlendirme yapılır)\n" +
                "yolculuk yapacağınız şehri yazın : ");
        String destination = scan.next().toLowerCase(Locale.forLanguageTag("tr"));
        double istFee = (300 / 50) * 20;
        double ankFee = (200 / 50) * 20;

        switch (destination) {
            case "istanbul":
                System.out.print("Rota : İstanbul\nYolcu sayısı girin : ");
                int passengerİ = scan.nextInt();
                System.out.print(passengerİ + " kişi için ücret : " + (istFee * passengerİ) + " TL\n" +
                        "Ödeme yapacağınız tutarı girin : ");
                int istPayment = scan.nextInt();
                if (istPayment < 0) {
                    System.out.println("hatalı giriş");
                } else if (istPayment < istFee * passengerİ) {
                    System.out.println("yapılacak ödeme bilet ücretinden az olamaz");
                } else System.out.println("Para üstü : " + (istPayment-istFee*passengerİ) + " TL");
                break;
            case "ankara":
                System.out.print("Rota : Ankara\nYolcu sayısı girin : ");
                int passengerA = scan.nextInt();
                System.out.print(passengerA + " kişi için ücret : " + (ankFee * passengerA) + " TL\n"+
                        "ödeme yapacağınız tutarı girin : ");
                int ankPayment = scan.nextInt();
                if (ankPayment < 0) {
                    System.out.println("hatalı giriş");
                } else if (ankPayment < ankFee * passengerA) {
                    System.out.println("yapılacak ödeme bilet ücretinden az olamaz");
                } else System.out.println("Para üstü : " + (ankPayment-ankFee*passengerA)+ " TL");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");


        }
    }
}
