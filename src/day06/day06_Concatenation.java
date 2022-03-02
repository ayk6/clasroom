package day06;

public class day06_Concatenation {
    public static void main(String[] args) {
        // iki string değişkeni birleştirme
        String a="atın";
        String b="oğlu";
        System.out.println(a + " " +b);

        String word1 = "ilk";
        String word2="son";
        int num1=4;
        int num2=5;

        System.out.println(word1+num1+word2); //ilk4son
        System.out.println(num1+word1+num1+num2); //4ilk45
        System.out.println(num1+num2); //9
        System.out.println(num1+num2+word1); //9ilk
        System.out.println(word1+num1*num2); //ilk20 (çarpma öncelikli)
        //önce kelime girilirse toplama çıkarma yapmıyor,,string algılıyor
        // parantez olursa da öncelikli

        System.out.println(num1+num2+word1);//9ilk
        //45ilk yazmak için ne yapabiliriz?
        System.out.println(num1+(num2+word1)); //bu olabilir
        // asıl yöntem con başa hiçlik eklemek
        System.out.println(""+num1+num2+word1); //45 ilk
        //sayıyı string e çevirmek istersek Integer.ValueOf(str)
        //ya da ""+sayi da çevirir



    }
}
