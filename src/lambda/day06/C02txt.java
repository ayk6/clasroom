package lambda.day06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class C02txt {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("src/day06/try.txt")).forEach(System.out::println);

        // büyük harfle yazdır
        Files.lines(Paths.get("src/day06/try.txt")).map(t->t.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);

        // ilk satır küçük harf
        Files.lines(Paths.get("src/day06/try.txt")).map(String::toLowerCase)
                .limit(1).forEach(System.out::println);
    }
}
