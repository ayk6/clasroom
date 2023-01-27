package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L03 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("first","sec","3rd","fourth","last","last"));

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

        // check all elements don't start w f
        System.out.println(
                words.stream().noneMatch(t->t.startsWith("f")) // false
        );

        // print largest word
        System.out.println(
                Arrays.toString(words.stream().sorted(Comparator.comparing(String::length).
                        reversed()).limit(1).toArray()));
        // limit returns stream nd we can convert to array, then print

        // sort by last char nd print but skip first word
        words.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .skip(1).forEach(L03::printStrWSpace);


    }

    public static void printStrWSpace(String s){
       System.out.print(s+" ");
    }
}
