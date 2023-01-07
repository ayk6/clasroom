package day30;

import java.util.LinkedList;
import java.util.Queue;

public class C05_queue {
    public static void main(String[] args) {
        // first in first out
        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Bread");
        wareHouse.add("Yoghurt");
        wareHouse.add("Gum");
        wareHouse.add("Water");
        wareHouse.add("Candy"); // keeps in order

        wareHouse.offer("cologne");
        // if there is enough space, adds element and returns true
        // else throws exception, returns false
    }
}
