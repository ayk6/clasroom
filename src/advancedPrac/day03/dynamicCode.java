package advancedPrac.day03;

import java.util.Scanner;

public class dynamicCode {
    public static void main(String[] args) {
        //x gün sonrası hangi gün yazdır
        Scanner scan = new Scanner(System.in);
        System.out.print("Haftanın kaçıncı gününde olduğunuzu yazın" +
                "\n(Pzt-1, Salı-2, Çrş-3, Prş-4, Cuma-5, Cts-6, Pzr-7)  : ");
        int day = scan.nextInt();
        if (day< 1 || day >7){
            System.out.println("hatalı giriş");}
            else {
            System.out.println("kaç gün sonrasını öğrenmek istiyorsunuz?");
            int wantedDay = scan.nextInt();
            int findingDay = (wantedDay % 7 + day) % 7;

            switch (findingDay) {
                case 1:
                    System.out.println(wantedDay + " gün sonra günlerden pazartesi olacak");
                    break;
                case 2:
                    System.out.println(wantedDay + " gün sonra günlerden salı olacak");
                    break;
                case 3:
                    System.out.println(wantedDay + " gün sonra günlerden çarşamba olacak");
                    break;
                case 4:
                    System.out.println(wantedDay + " gün sonra günlerden perşembe olacak");
                    break;
                case 5:
                    System.out.println(wantedDay + " gün sonra günlerden cuma olacak");
                    break;
                case 6:
                    System.out.println(wantedDay + " gün sonra günlerden cumartesi olacak");
                    break;
                case 0: //mod olduğu için 7/7 sıfır verecek
                    System.out.println(wantedDay + " gün sonra günlerden pazar olacak");
                    break;
            }
        }
    }
}
