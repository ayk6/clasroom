package day05;

import java.util.Scanner;

public class C01ifElseStatement {
    public static void main(String[] args) {
        // if (boolean) condition
        // else default

        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        if (num%2==0) System.out.println("even number");
        else System.out.println("odd number");

        // more than 2 conditions -> else if

        if (num<0) System.out.println("negative");
        else if (num>0) System.out.println("positive");
        else System.out.println("neutral");

    }
}
