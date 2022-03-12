package day17;

public class forLoop3 {
    public static void main(String[] args) {
        //verilen iki harf arasındaki harfleri yazdır

        char firstLetter = 'a';
        char lastLetter = 'z';

        for (char c=firstLetter; c<= lastLetter; c++){
            System.out.print(c+" ");
        }
    }
}
