package day07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C01txt {
    public static void main(String[] args) throws IOException {
        Path txtPath = Path.of(("src/day06/try.txt"));
        // txt içeriği değişkene atandı
        Stream<String> strm = Files.lines(txtPath);
        // txt akışa atandı
        Files.lines(txtPath).forEach(System.out::println); // txt akış haline getirildi (akış methodları kullanılabilir)
        strm.forEach(System.out::println);

        // ilk satırı küçük harf yazdır
        System.out.println(Files.lines(txtPath).map(String::toLowerCase).findFirst());

        // "cümle" kaç kez geçiyor yazdır
        System.out.println(Files.lines(txtPath).
                filter(t -> t.contains("cümle")).count());

        // flatMap nested list'leri tek list haline getirir
        // split her satırı array haline getirir
        System.out.println(Files.lines(txtPath).map(t -> t.split(" ")).flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList()));

        // kaç farklı harf kullanıldı yazdır
        System.out.println(Files.lines(txtPath).
                map(t -> t.replaceAll("\\W", "")
                        .split("")).flatMap(Arrays::stream).distinct().count());
    }
}
