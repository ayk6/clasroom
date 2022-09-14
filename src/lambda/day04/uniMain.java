package lambda.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uniMain {
    public static void main(String[] args) {
        Uni obj1 =new Uni("bgzc","isletme",120,65);
        Uni obj2 =new Uni("odtu","mat",55,75);
        Uni obj3 =new Uni("ıtu","muh",260,50);
        Uni obj4 =new Uni("ytu","comp",30,44);
        Uni obj5 =new Uni("tou","hukuk",170,60);

        List <Uni> unv=new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4,obj5));
        System.out.println(isGrade65(unv)); // false

    }
    // not ort 65 ya da büyük mü kontrol et
     public static boolean isGrade65(List<Uni> unv){
         return unv.stream().allMatch(t->t.getAvGrade()>=65);
     }
}
