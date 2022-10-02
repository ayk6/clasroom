package day07;

public class C01ternary {
    public static void main(String[] args) {

        // condition  ?  true statement : false statement ;

        int num =0;

        int numAbs = num<0 ? -1*num : num ;

        // Object is used to assign different data types

        Object obj = num<0 ? -1 : "positive" ;

        // Nested ternary
        // is leap year?

        int year = 1800;
        Object isLeapYear = year%100==0 ?
                (year%400==0 ? "leap year" : year) :
                (year%4 == 0 ? "leap year" : year) ;
        System.out.println(isLeapYear);

    }
}
