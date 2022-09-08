
package advancedPrac.day02;

import java.util.Scanner;

public class bloodDonationTest {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı girin");
        int age = scan.nextInt();
        System.out.println("kilonuzu girin");
        int weight = scan.nextInt();

        if (age>=0 && age<18){
            System.out.println("kan bağışı yapamaz(yaş)");}
        else if(age>=18){
            if (weight>0 && weight<50 ){
                System.out.println("kan bağışı yapamaz(kg)");}
            else if (weight>=50){
                System.out.println("kan bağışı yapabilir");}
            else System.out.println("hatalı kilo girişi");
        }
        else System.out.println("hatalı veri girişi");
    }
}

