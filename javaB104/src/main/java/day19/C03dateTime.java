package day19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03dateTime {
    public static void main(String[] args) {

        LocalDateTime cdt = LocalDateTime.now();
        // hh => 12 hours  HH=> 24 hours

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:s");
        System.out.println(dtf.format(cdt)); // 10:40:58

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf2.format(cdt)); // 22:43:15

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:s a");
        System.out.println(dtf3.format(cdt)); // 10:40:58 10:51:30 ÖS
    }
}
