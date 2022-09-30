package day06;

import java.util.Scanner;

public class C02switch {
    public static void main(String[] args) {
        // if condition has too many ops - using switch is simple

        Scanner scan = new Scanner(System.in);
        System.out.print("enter your number of day : ");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid choice");
                break;
        }

    }
}
