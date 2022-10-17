package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04arrayLists {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("y");
        letters.add("k");

        List<String> goal = new ArrayList<>();
        goal.add("gone");
        goal.add("gone");
        goal.add("gone");

        Scanner scan = new Scanner(System.in);


        do {
            System.out.print("write your letter : ");
            String letter = scan.next();
            if (letters.contains(letter)) {
                System.out.println("match");
                letters.set(letters.indexOf(letter),"gone");
            }
            else System.out.println("try again.");
        }
        while (!letters.equals(goal));

    }
}
