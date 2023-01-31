package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L04 {
    // create pojo class, univ, department, students count, average

    public static void main(String[] args) {
        University uni1 = new University("odtu","pcEng",200,60);
        University uni2 = new University("itu","math",300,45);
        University uni3 = new University("ank","law",500,30);
        University uni4 = new University("bozok","preSch",50,70);

        List<University> uniList = new ArrayList<>(Arrays.asList(uni1,uni2,uni3,uni4));

        // check averages higher than 65
        System.out.println(uniList.stream().allMatch(t -> t.getAverage() > 65) ? "all averages higher than 65" :
                "all averages are not higher than 65");

        // check are there any math department
        System.out.println(uniList.stream().anyMatch(t -> t.getDepartment().equalsIgnoreCase("MATH")) ?
                "math department exists" : "math department doesn't exist");

        // sort by stu count
        System.out.println(sortByStuCount(uniList));

        //count math departments
        System.out.println(
                uniList.stream().filter(t -> t.getDepartment().contains("math")).count());

        // print highest average from 200+ departments
        System.out.println(
                uniList.stream().filter(t -> t.getStudentCount() > 200).
                mapToInt(University::getAverage).max()); // 45


    }

    private static List<University> sortByStuCount(List<University> uniList) {

        return uniList.stream().sorted(Comparator.comparing(University::getStudentCount))
                .collect(Collectors.toList());
    }
}
