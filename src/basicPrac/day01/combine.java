package basicPrac.day01;

import java.util.Scanner;

public class combine {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("İlk kelime : ");
        String str1 = scan.nextLine();
        System.out.print("İkinci kelime : ");
        String str2 = scan.nextLine();

        System.out.println("\nKelimelerin ilk method ile birleşimi : "
        +str1+" "+str2);
        System.out.println("\nKelimelerin ikinci method ile birleşimi : "
                +str1.concat(" "+str2));
        String ilkharfsiz = str1.substring(1)+" "+str2.substring(1);
        System.out.println("\nkelimelerin ilk harfleri olmaksızın birleşimi : "+ilkharfsiz);



    }
}
