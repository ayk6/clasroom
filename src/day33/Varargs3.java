package day33;

public class Varargs3 {
    public static void main(String[] args) {
        // parametre olarak bir int ve değişen sayıda string alan en uzun
        // kelime harf sayısı ile int çarp

        int num = 4;
        String str1 = "asdf";
        String str2 = "qwerty";

        multiplic(num, str1, str2);
        // bir metotta varargs dışında parametre varsa en sona varargs yazılır
        // bir metotta tek varargs bulunabilir
    }

    private static void multiplic(int num, String... str) {
        String longestStr="";

        for (String each: str) {
            if (each.length() > longestStr.length()) {
                longestStr = each;
            }
        }
        System.out.println(longestStr.length()*num);
    }
}
