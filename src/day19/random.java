package day19;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rand = new Random();

        int num=rand.nextInt(100); //100 den küçük rastgele sayı oluşturur

        Scanner scan = new Scanner(System.in);

        int guess =0;
        int count = 0;

        while (num!=guess){
            System.out.print("100'den küçük sayı girin : ");
            guess = scan.nextInt();

            if (guess<num){
                System.out.println("yukarı");
            }
            else System.out.println("aşağı");

            count++;
        }
        System.out.println(count +". tahmin doğru : " +guess);

    }
}
