package day46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorC {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // listeyi üç artır yazdır

        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next()); //4 6 8 10 12
        }

        ListIterator listItr = list.listIterator();

        while (listItr.hasNext()) {
            Object num= listItr.next();
            listItr.set((Integer)num+3);
        }
        System.out.println(list); // [7, 9 ,11 ,13 ,15]
        // for each yalnızca loop içerisinde yapar
        // list iterator kalıcı yapar

        // listeyi ters yazdır

        while (listItr.hasNext()){
            listItr.next();
        } // sona götürür

        while (listItr.hasPrevious()){
            System.out.println(listItr.previous()); // 15 13 11 9 7
        }
    }
}
