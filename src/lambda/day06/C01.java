package lambda.day06;

import java.util.stream.IntStream;

public class C01 {
    public static void main(String[] args) {
        // 1'den x'e kadar olan sayıları topla
        int x=10;
        System.out.println(IntStream.rangeClosed(0, x).sum());

        // 1 to x çiftleri topla
        System.out.println(IntStream.rangeClosed(0,x).filter(t->t%2==0).sum());

        // 1'den başla ve x adet pozitif çift sayıyı topla
        System.out.println(IntStream.iterate(2,t->t+2).limit(x).sum());

        // 2'nin ilk x üssünü yazdır
        IntStream.iterate(2,t->t*2).limit(x).forEach(System.out::println);

        // x!
        System.out.println(IntStream.rangeClosed(1, x).reduce(Math::multiplyExact));
        IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);

        // sayı pow x
        System.out.println(Math.pow(2,x));
        System.out.println(IntStream.iterate(2, t -> t * 2)
                .limit(x).skip(x - 1).reduce(Integer::sum));
    }
}
