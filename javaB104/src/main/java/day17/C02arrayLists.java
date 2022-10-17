package day17;

import java.util.ArrayList;
import java.util.List;

public class C02arrayLists {
    public static void main(String[] args) {
        List<Double> salaries = new ArrayList<>();
        salaries.add(995.0);salaries.add(1500.0);salaries.add(600.0);
        salaries.add(850.0);salaries.add(1250.0);salaries.add(1000.0);

        for (int i=0;i<salaries.size();i++){
            if (salaries.get(i)<1000){
                salaries.set(i,salaries.get(i)*1.2);
            }
            else salaries.set(i,salaries.get(i)*1.1);
        }
        System.out.println(salaries);

        List<Double> salaries2 = new ArrayList<>(salaries);
        System.out.println(salaries.equals(salaries2)); // true
    }
}
