package day47;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();

        ll1.addFirst(1); // add methodundan daha hızlı
        ll1.addLast(9); // add methodundan daha hızlı
        System.out.println(ll1.element()); // ilk elemanı yazdırır , silmez
        ll1.getLast(); // son elemanı getirir
        ll1.getFirst(); // ilk elemanı getirir
        ll1.offer(5); // sona ekler
        System.out.println(ll1);
        ll1.offerLast(2); // sona ekler
        ll1.offerFirst(8); // başa ekler

        System.out.println(ll1.poll()); // son elemanı silip getirir
        System.out.println(ll1);

        System.out.println(ll1.poll()); // ilk elemanı silip getirir
        System.out.println(ll1);
    }
}
