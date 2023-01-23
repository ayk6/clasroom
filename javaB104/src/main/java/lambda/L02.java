package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L02 {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>(Arrays.asList(11, 56, 35, 99, 0, -19, 25, 36, 14, 4));

        // print pow even numbs
        numbs.stream().filter(t->t%2==0).map(t->t*t).forEach(L01::printWSpace);
        // map changes elements,
        System.out.println();

        //print the square root of even numbers
        numbs.stream().filter(t->t%2==0).map(Math::sqrt).forEach(t->System.out.print(t+" "));
        System.out.println();

        // largest element
        Optional<Integer> largestNum = numbs.stream().reduce(Math::max);
        System.out.println(numbs.stream().reduce(Math::max));
        System.out.println(numbs.stream().reduce(Integer::max)); // faster
        // if u need only one element, use reduce

        // print largest pow even numbs
        System.out.println(
                numbs.stream().filter(t->t%2==0).map(t->t*t).reduce(Integer::max)
        );

        // sum all elements
        System.out.println(
                numbs.stream().reduce(0, Integer::sum));


    }
}
