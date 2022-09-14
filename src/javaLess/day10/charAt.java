package javaLess.day10;

import java.util.Locale;

public class charAt {
    public static void main(String[] args) {
        //string data içinden herhangi bir harf almak istediğimizde
        //str.charAt(istenenIndex)

        String str ="Java Easy";
        System.out.println(str.charAt(0));//ilk harf J
        System.out.println(str.charAt(5));//6. harf E
        System.out.println(str.charAt(5)+str.charAt(6));//ASCII devreye girer
        System.out.println(""+str.charAt(5)+str.charAt(6));//String olur 6 ve 7. harfleri yazdırır Ea
        //küçük-büyük harfe çevirme
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5));//e yazdırır
        System.out.println(""+str.toLowerCase(Locale.ROOT).
                charAt(5)+str.toUpperCase(Locale.ROOT).charAt(6));
                //String olur 6 ve 7. harfleri yazdırır eA
        //son karakter
        System.out.println(str.charAt(9-1));
    }
}
