package day14;

import java.util.Arrays;
import java.util.Comparator;

public class C03arrays {
    public static void main(String[] args) {
        String str ="function to find the longest word.";
        // print longest word

        str = str.replaceAll("\\p{Punct}","");

        String[] words= str.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(words[words.length-1]);
    }
}
