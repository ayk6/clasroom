package javaLess.day41;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        do {
            System.out.println("toplama işlemi yapılacak sayıyı yazın\n" +
                    "Bitirmek için 'q' tuşuna basın : ");
            int num=0;

            try {
                num = scan.nextInt();
                result+=num;
                System.out.println("Sayılar toplamı : "+result);
            } catch (Exception e) {
                String wrongInput = scan.next();
                if (wrongInput.equalsIgnoreCase("q")){
                    System.out.println("Sayılar toplamı : "+result);
                    break;
                }else {
                    System.out.println("Hatalı giriş");
                }
            }
        }while (result<500);
    }
}
