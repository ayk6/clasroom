package day46;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorC2 {
    public static void main(String[] args) {
        // listede istenen aralıkta olmayan sayıları sil
        // 20 - 40 (sayılar dahil)

        List<Integer> list = new ArrayList<>();

        list.add(29); list.add(15); list.add(20); list.add(35);
        list.add(9); list.add(100); list.add(-68); list.add(34);

        ListIterator itr = list.listIterator();

        while (itr.hasNext()) {
            Object num = itr.next();

            if ((Integer)num<20||(Integer)num>40){
                itr.remove();
            }
        }
        System.out.println(list); // [29, 20 ,35 ,34]
    }
}
