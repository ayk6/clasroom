package javaLess.day33;

public class Varargs2 {
    public static void main(String[] args) {

        String str1 = "ilk";
        String str2 = "ikii";
        String str3 = "üç......";

        // yazılan argüment sayısı sabit değil ise varargs tercih edilir
        longestWord(str1,str2,str3);
    }

    private static void longestWord(String... str) {
        String longestStr="";

        for (String each: str){
            if (each.length()>longestStr.length()){
                longestStr=each;
            }
        }
        System.out.println("en uzun kelime : "+longestStr);
    }
}
