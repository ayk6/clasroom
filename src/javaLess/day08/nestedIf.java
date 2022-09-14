package javaLess.day08;

import java.util.Locale;
import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyet giriniz" +
                "\n(Kadın için K Erkek için E)");
        char sex=scan.next().toLowerCase(Locale.ROOT).charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double age= scan.nextDouble();
        if (sex=='k'){
            if (age<0 || age>150) {System.out.println("Hatalı yaş girişi");}
            else if (age<60) System.out.println("Emekli olamazsınız\n"
                    + (60-age) +"yıl çalışmanız gerek");
            else System.out.println("Emekli olabilirsiniz");
        }
        else if (sex=='e'){if (age<0 || age>150) {System.out.println("Hatalı yaş girişi");}
        else if (age<65) System.out.println("Emekli olamazsınız\n"
                + (65-age) +" yıl çalışmanız gerek");
        else System.out.println("Emekli olabilirsiniz");
        }
        else {System.out.println("Hatalı giriş yaptınız");}


    }
}
