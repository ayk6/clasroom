package lambda;

import java.util.stream.IntStream;

public class L05 {
    public static void main(String[] args) {
        sum1toX(4);

        sum1toXButEvens(10);

        sumFirstXEvens(10);

        sumFirstXNums(10);

        printPow2(5);

        printPowGivenNum(3,5);

        factorial(5);

    }

    public static void sum1toX(int x){
        System.out.println(IntStream.range(1,x+1).sum());
    }

    private static void sum1toXButEvens(int x) {
        System.out.println(IntStream.range(2, x + 1).filter(t -> t % 2 == 0).sum());
    }

    private static void sumFirstXEvens(int x) {
        System.out.println(IntStream.iterate(2, t -> t + 2).limit(x).sum());
    }

    private static void sumFirstXNums(int i) {
        System.out.println(
                IntStream.iterate(1,t->t+1).limit(i).sum()
        );
    }

    private static void printPow2(int i) {
        IntStream.iterate(2,t->t*2).limit(i).forEach(L01::printWSpace);
    }

    private static void printPowGivenNum(int x, int y) {
        IntStream.iterate(x,t->t*x).limit(y).forEach(L01::printWSpace);
    }

    private static void factorial(int i) {
        System.out.println(IntStream.rangeClosed(1, i).reduce(1, (t, u) -> t * u));
    }
}
