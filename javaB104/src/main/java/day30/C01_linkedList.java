package day30;

import java.util.LinkedList;

public class C01_linkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Walt");
        names.add("Saul");
        names.add("Pete");
        names.add("Jess");
        names.add("Gus");
        names.add("Mike");

        System.out.println(names.peek()); // Walt
        // returns first element, not removes
        // if list is empty, returns null

        System.out.println(names.poll());
        // returns first element and removes
        // if list is empty, not throws exception

        System.out.println(names.element());
        // returns first element, not removes
        // if list is empty, throws Exception
    }
}
