package practiceJava.others;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your number : ");
        int num = scan.nextInt();

        System.out.println(fibonacci(num));
    }
    private static String fibonacci(int num) {
        int a =0;
        int b=1;
        if(num == a || num==b) return "yes";
        int c = a+b;
        while (c<=num){
            if(c==num) return "yes";
            a=b;
            b=c;
            c=a+b;
        }
        return "no";
    }
}
