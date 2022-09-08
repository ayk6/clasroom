package basicPrac.day03;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {
        //ilkel hesap makinesini method içerisinde oluştur


        Scanner scan = new Scanner(System.in);
        System.out.println("işlem yapılacak sayıları yazın :");
        double num1 =scan.nextDouble();
        double num2 =scan.nextDouble();
        System.out.println("yapılacak işlemi yazın :\n( + , - , * , / )");
        char process = scan.next().charAt(0);;

        calculator(num1,num2,process);
    }

    private static void calculator(double num1, double num2, char process) {
        switch (process) {
            case '+':
                System.out.println("toplama işlemi sonucu : " + (num1 + num2));
                break;
            case '-':
                System.out.println("çıkarma işlemi sonucu : " + (num1 - num2));
                break;
            case '*':
                System.out.println("çarpma işlemi sonucu : " + (num1 * num2));
                break;
            case '/':
                System.out.println("bölme işlemi sonucu : " + (num1 / num2));
                break;
            default:
                System.out.println("hatalı giriş");
        }
    }
}