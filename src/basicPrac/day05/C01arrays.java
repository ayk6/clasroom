package basicPrac.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01arrays {
    public static void main(String[] args) {
        // get user name w scanner and trim
        Scanner scan = new Scanner(System.in);
        System.out.print("write user name : ");
        String userName = scan.next().trim();

        List<String> userNames = new ArrayList<>();
        userNames.add("omen");
        userNames.add("jett");
        userNames.add("fade");
        userNames.add("raze");
        userNames.add("sova");
        userNames.add("kay-o");
        userNames.add("sage");

        // compare username w given array
        boolean compare = userNames.contains(userName);

        if (compare){
            System.out.println("username already exist.");
        }
        else System.out.println("username ("+ userName +") added.");

        scan.close();





    }
}
