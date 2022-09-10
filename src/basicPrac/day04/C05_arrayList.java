package basicPrac.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_arrayList {
    public static void main(String[] args) {
        // create a scanner and create a list that input length
        // then get list length input
        // print list

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.print("List length : ");
        int listLength = scanner.nextInt();

        for (int i=0; i<listLength;i++){
            System.out.print((i+1)+". element : ");
            list.add(scanner.nextInt());
        }

        System.out.println(list);
    }
}
