package javaLess.day02;

import java.util.Scanner;

public class day02Scanner {
    public static void main(String[] args) {
        //3 adımda scanner 1-create 2 - istenen değeri bildir
        Scanner scan= new Scanner(System.in);

        System.out.println("Kullanıcı adı gir");
        //3- istenen değere uygun değişkeni kaydet

        String userName=scan.next();
        System.out.println("kullanıcı adı: " + userName);


    }
}
