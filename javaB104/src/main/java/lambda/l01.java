package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l01 {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>(Arrays.asList(11, 56, 35, 99, 0, -19, 25, 36, 14, 4));

        // print w one space
        numbs.forEach(t -> System.out.print(t + " "));
        System.out.println();
        numbs.forEach(l01::printWSpace);
        System.out.println();

        // print even and less than 50 numbs
        numbs.stream().filter(t -> t < 50 && t % 2 == 0).forEach(l01::printWSpace);

        System.out.println();

        // print even or less than 50 numbs
        numbs.stream().filter(t -> t < 50 || t % 2 == 0).forEach(l01::printWSpace);
    }

    public static void printWSpace(int a) {
        System.out.print(a + " ");
    }
}
