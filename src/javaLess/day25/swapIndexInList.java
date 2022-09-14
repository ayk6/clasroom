package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class swapIndexInList {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);

        int firstIndex=2;
        int secondIndex=5;

        System.out.println(numbers); //[1, 3, 5, 3, 5, 6, 1, 7]


        numbers=swapIndex(numbers,firstIndex,secondIndex);

        System.out.println(numbers);
    }

    private static List<Integer> swapIndex(List<Integer> numbers, int firstIndex, int secondIndex) {
        //bir temp sayı oluştur
        int temp=0;
        if ((firstIndex > numbers.size() - 1) || (secondIndex > numbers.size() - 1)
                || firstIndex<0 || secondIndex<0) {
            System.out.println("Lutfen Gecerli bir index giriniz");
        } else {
            temp=numbers.get(firstIndex);
            numbers.set(firstIndex,numbers.get(secondIndex));
            numbers.set(secondIndex,temp);
        }
        return numbers;
    }
}
