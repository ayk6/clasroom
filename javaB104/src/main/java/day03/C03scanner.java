package day03;

import java.util.Scanner;

public class C03scanner {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        System.out.print("write year : ");
         int year = scan.nextInt();

        System.out.println("year : "+year);

        System.out.print("write side length of the square : ");
        int edge =scan.nextInt();

        System.out.println("perimeter of square : "+edge*4);
        System.out.println("are of square : "+edge*edge);
    }
}
