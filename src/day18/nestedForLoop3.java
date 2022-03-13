package day18;

public class nestedForLoop3 {
    public static void main(String[] args) {

        /*   *
             * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

         */ //geometrik şekli çiz

        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= input-1 /*input da çalıştı */ ; i++) {
            for (int j = (input - 1); j >= i; j--)
            //for (int j=1; j<= input-i; j++) da olur
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
