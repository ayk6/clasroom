
package advancedPrac.day01;

import java.util.Scanner;

public class BMI_calc {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak yazınız");
        double boy= scan.nextDouble();
        System.out.println("kilonuzu(kg) yazınız");
        double kg= scan.nextDouble();

        double bmi=kg/((boy/100)*(boy/100));

        if(0<bmi&&bmi<=20) {
            System.out.println("zayıf - bmi : "+bmi);}
        else if(20<bmi&&bmi<=25) {
            System.out.println("normal- bmi : "+bmi);}
        else if(25<bmi&&bmi<=30) {
            System.out.println("şişman- bmi : "+bmi);}
        else if(bmi>30) {
            System.out.println("obez- bmi : "+bmi);}
        else System.out.println("hatalı giriş yaptınız");


    }

}
