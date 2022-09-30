package day06;

import java.util.Scanner;

public class C03primalCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first num : ");
        int num1 = scan.nextInt();

        System.out.print("enter sec num : ");
        int num2 = scan.nextInt();

        System.out.print("enter op ( +,-,*,/ ) : ");
        char op = scan.next().charAt(0);

        switch (op) {
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}
