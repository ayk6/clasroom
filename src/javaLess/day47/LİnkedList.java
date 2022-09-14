package javaLess.day47;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LİnkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(4); // linkedlist - iki interface de kullanılır

        // linked listin 2 parent ınterface'i vardır
        // sadece list methodlarını kullanmak için :

        List <Integer> ll2 = new LinkedList<>();

        ll2.remove(0); // tek interface

        // sadece Deque methodlarını kullanmak için

        Deque <Integer> ll3 = new LinkedList<>();
         ll3.addFirst(0); // tek interface
    }
}
