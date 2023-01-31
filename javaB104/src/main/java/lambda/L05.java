package lambda;

import java.util.stream.IntStream;

public class L05 {
    public static void main(String[] args) {
        sum1toX(4);

        sum1toXButEvens(10);

        sumFirstXEvens(10);

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
}
