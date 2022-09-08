
package advancedPrac.day02;

import java.util.Scanner;

public class penaltyTraffic {
    public static void main(String[] args) {
         /*     Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("ehliyet var ise +, yok ise - yazın");
        char ehliyet= scan.next().charAt(0);

        if (ehliyet=='+'||ehliyet=='-') {
            if (ehliyet=='-'){
                System.out.println("ehliyet cezası 200$");}

                System.out.println("hızınızı yazın");

            int hız = scan.nextInt();

            if (ehliyet == '+') {
                if (hız < 0) {
                    System.out.println("hatalı hız girişi");
                } else if (hız > 54 && hız < 75) {
                    System.out.println("ceza : 100$");
                } else if (hız >= 75 && hız <= 94) {
                    System.out.println("ceza : 320$");
                } else if (hız > 94) {
                    System.out.println("ceza : 500$");
                } else System.out.println("hız sınırı aşılmadı");
            } else if (ehliyet == '-') {
                if (hız < 0) {
                    System.out.println("hatalı hız girişi");
                } else if (hız > 54 && hız < 75) {
                    System.out.println("toplam ceza : 300$");
                } else if (hız >= 75 && hız <= 94) {
                    System.out.println("toplam ceza : 520$");
                } else if (hız > 94) {
                    System.out.println("toplam ceza : 700$");
                } else System.out.println("hız sınırı aşılmadı - ehliyet cezası 200$");
            } else System.out.println("hatalı tuşlama");
        }
        else System.out.println("hatalı ehliyet tuşlaması");

    }
}

