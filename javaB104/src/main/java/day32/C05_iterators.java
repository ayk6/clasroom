package day32;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_iterators {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("S");
        myList.add("D");
        myList.add("F");

        for (String w:myList) {
            w+=".";
        }
        System.out.println(myList); // [A, S, D, F]
        // loops cannot make changes on collections
        // we can use Iterators to update collections

        ListIterator<String> itr = myList.listIterator();
        // we can also use Iterator but Iterator has less method

        while (itr.hasNext()){
            //String element = itr.next();
            itr.set(itr.next()+".");
        }
        System.out.println(myList); // [A., S., D., F.]
    }
}
