package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L03 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("firs","sec","3rd","fourth","last","last"));

        // uppercase, natural sort and print w no repeat (distinct)
        words.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t+" "));
        System.out.println();
        words.stream().map(String::toUpperCase).sorted().distinct().forEach(L03::printStrWSpace);
        System.out.println();

        // print character counts reverse sorted w no repeat
        words.stream().map(String::length).distinct().sorted(Comparator.reverseOrder()).forEach(L01::printWSpace);

        // check char counts are less than 7
        System.out.println(words.stream().allMatch(t -> t.length() < 7)); // true
        System.out.println(words.stream().allMatch(t -> t.length() < 7)?"true":"false"); // true


    }

    public static void printStrWSpace(String s){
       System.out.print(s+" ");
    }
}
