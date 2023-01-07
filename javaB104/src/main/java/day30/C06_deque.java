package day30;

import java.util.Deque;
import java.util.LinkedList;

public class C06_deque {
    // double ended queue
    // FIFO or LIFO, both works
    public static void main(String[] args) {
        Deque<String> truck = new LinkedList<>();
        truck.add("Mirror");
        truck.add("Chair");
        truck.add("Fridge");
        truck.add("Carpet");

        truck.addLast("case");
        truck.addFirst("books");
        // there are methods first and last, both sides

        truck.push("lamp");
        // checks capacity, and if false, throws exception
        // else adds firs
    }
}
