package lambda.day05;

import lambda.day04.Uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniMain2 {
    public static void main(String[] args) {
        Uni obj1 =new Uni("bgzc","isletme",120,65);
        Uni obj2 =new Uni("odtu","mat",55,75);
        Uni obj3 =new Uni("ıtu","muh",260,50);
        Uni obj4 =new Uni("ytu","comp",30,44);
        Uni obj5 =new Uni("tou","hukuk",170,60);

        List<Uni> unv=new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4,obj5));

        System.out.println(studCount(unv)); // false
        isThereMath(unv);
        studSort(unv); // collect stream olan elemanları toplar
            // daha sonra list vb. atanabilir
        SecondLeastStudent(unv);
        collStuNums(unv); // map yerine mapToInt kullanılırsa doğrudan int
                // değerler akışa gelir ve doğrudan sum kullanılabilir
        maxGrade(unv);
    }
    public static boolean studCount (List <Uni> unv){
        return unv.stream().allMatch(t->t.getStudents()<100);
    }
    public static void isThereMath(List<Uni> unv){
        if (unv.stream().anyMatch(t -> t.getDepartment() == "mat")) {
            System.out.println("mat bölümü var");
        } else {
            System.out.println("mat bölümü yok");
        }
    }
    public static void studSort(List<Uni> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing
                (Uni::getStudents).reversed()).
                collect(Collectors.toList()));
    }
    public static void SecondLeastStudent(List<Uni> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing(Uni::getStudents)).
                limit(2).skip(1).collect(Collectors.toList()));
    }
    public static void collStuNums(List<Uni> unv){
        System.out.println(unv.stream().map(Uni::getStudents).
                // reduce(Integer::sum));
                // reduce(Math::addExact));
                      reduce(0, (x, y) -> x + y));
    }
    public static void maxGrade(List<Uni> unv){
        System.out.println(unv.stream().mapToInt(Uni::getAvGrade).max());
    }
}
