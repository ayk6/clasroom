package day29;

import java.util.LinkedList;

public class C01_LinkedLists {
    // all elements consist of two parts 1- Data, 2- Pointer
    // elements are called Node
    // before first element there is a Head, last node is Tail

    // add or deleting element are fast but searching not
    // linked list doesn't use index

    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Walt");
        visitors.add("Jess");
        visitors.add("Jim");
        visitors.add("Mike");
        visitors.add("Gus");
        visitors.add(2,"Hank");

        System.out.println(visitors);

        visitors.addLast("Sky");
        visitors.addFirst("Saul");
        visitors.removeLast();
        visitors.removeFirst();

        System.out.println(visitors);

        visitors.add("Jim");
        visitors.removeFirstOccurrence("Jim");
        System.out.println(visitors);

        visitors.add("Sky");
        visitors.removeLastOccurrence("Sky");
        System.out.println(visitors);

        System.out.println(visitors.pop()); // walt
        // Removes and returns first element
        // if linkedList empty, throws NoSuchElementException
    }
}
