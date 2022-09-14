package javaLess.day16;

public class forLoop {
    public static void main(String[] args) {
        //String i tersten yazdır

        String sentence = "kimin ne oldugu belli kime ne olacagi belli degil";
        for (int num = sentence.length()-1; num >=0; num--) {
            System.out.print(sentence.substring(num, num+1));
        }

    }
}
