package javaLess.day11;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        String str1="Kralın da canı Allah'a emanet";

        System.out.println(str1.indexOf('A'));
        //A'nın indeksini döndürür (15. karakter)(ilkini)

        System.out.println(str1.indexOf("da"));
        //harfin ya da harf grubunun kaçıncı karakterde başladığını verir

        System.out.println(str1.indexOf('a', 10));
        //10. indexten itibaren aramaya başlar (10. kararkteri de dahil eder)

        int ilkindex = str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));
        //2. a harfini buldu

        System.out.println(str1.lastIndexOf('a'));
        //sondan başlayarak tarar

        System.out.println(str1.lastIndexOf("an"));
        //sondan başlayarak tarar

        System.out.println(str1.indexOf('J'));
        //olmayan karakteri -1 döndürür

        //kullanıcıdan mail adresi al, @ yoksa geçersiz, varsa geçerli yazdır
        System.out.println("mail adresi yazın");
        Scanner scan = new Scanner(System.in);
        String mail=scan.next();
        if(mail.indexOf('@')==-1){
            System.out.println("geçersiz");}
            else
            System.out.println("geçerli");

    }
}
