package javaLess.day10;

public class stringManipulation {
    public static void main(String[] args) {
        //CONCATE
        //String Manipulation birden fazla stringi birleştirir
        //tek string haline getirir
        String str1 = "Java";
        String str2 = "Easy";
        System.out.println(str1+" "+str2);//Java Easy yazdırır
        String cümle=str1.concat(str2);
        System.out.println(cümle);//JavaEasy yazdırır
        cümle=str1.concat(" ").concat(str2);
        System.out.println(cümle);//Java Easy yazdırır

        //concat string data ister
        //aksi durumda stringe çevirmeliyiz
    }
}
