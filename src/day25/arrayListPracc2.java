package day25;

import java.util.ArrayList;
import java.util.List;

public class arrayListPracc2 {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(3); numbers.add(5); numbers.add(3);
        numbers.add(5); numbers.add(6); numbers.add(1); numbers.add(7);
        System.out.println(numbers); /// [1, 3, 5, 3, 5, 6, 1, 7]

        listWithoutRepetition(numbers);
    }

    private static void listWithoutRepetition(List<Integer> numbers) {

        List<Integer> numbersWR = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++) {
            if (!numbersWR.contains(numbers.get(i))){
                numbersWR.add(numbers.get(i));
            }
        }
        System.out.println(numbersWR);
    }
}
