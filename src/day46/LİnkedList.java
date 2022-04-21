package day46;

import java.util.LinkedList;

public class LİnkedList {
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();
        // linked list hem class hem de Queue
        // listenin iki tarafında da işlem yapılabilir (first - last)

        list.add(4);
        list.add(6); // sona ekler
        list.addFirst(5); // başa ekler
        list.addLast(7); // sona ekler
        list.add(2,10); // belirtilen indexe ekler

        System.out.println(list); // [5, 4, 10, 6, 7]
    }
}
