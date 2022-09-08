package advancedPrac.day01;

import java.util.Scanner;

public class primitiveCalculator {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		System.out.println("ilkel hesap makinesi");
		Scanner scan =new Scanner(System.in);
		System.out.println("yapmak istediğiniz işlemi seçiniz \n(+,-,*,/)");
		char islem= scan.next().charAt(0);
		System.out.println("iki sayı giriniz");
		double num1= scan.nextDouble();
		double num2= scan.nextDouble();
		if(islem=='+'){
			System.out.println("toplama işleminin sonucu : "+(num1+num2));		}
		else if(islem=='-'){
			System.out.println("çıkarma işleminin sonucu : "+(num1-num2));		}
		else if(islem=='*'){
			System.out.println("çarpma işleminin sonucu : "+(num1*num2));		}
		else if(islem=='/'){
			System.out.println("bölme işleminin sonucu : "+(num1/num2));		}
		else System.out.println("hatalı seçim yaptınız");


	}

}
