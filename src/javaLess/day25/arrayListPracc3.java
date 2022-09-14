package javaLess.day25;

import java.util.ArrayList;
import java.util.List;

public class arrayListPracc3 {
    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(1.0);
        numbers.add(7.0);
        // ortalamayi bul

        double average=0.0;
        double total=0.0;

        for (int i=0; i<numbers.size(); i++){
            total += numbers.get(i);
        }
        average= total /numbers.size();
        System.out.println(total +"---"+ average); //31.0---3.875

        List<Double> overAverage = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++){
            if (numbers.get(i)>average){
                overAverage.add(numbers.get(i));
            }
        }
        System.out.println(overAverage);
    }
}
