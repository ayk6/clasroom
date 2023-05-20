package advancedJava.generics.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBound {
    public static void main(String[] args) {
        List<Object> myObjList = new ArrayList<>();
        addElements(myObjList);
        System.out.println(myObjList);

        List<Number> myNumList = new ArrayList<>();
        addElements(myNumList);
        System.out.println(myNumList);

        List<Double> myDbList = new ArrayList<>();
        // addElements(myDbList); RTE : not parent of Int
    }
    static void addElements(List<? super Integer> list){
        // generic but only integer class and parents
        // ? : wildcard  = unknown type -- useless
        // super : parents

        for (int i = 1; i<=10; i++){
            list.add(i);
        }

    }
}
