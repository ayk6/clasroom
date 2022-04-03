package day32;

import java.time.LocalDateTime;

public class LocalDateTime1 {
    public static void main(String[] args) {

        LocalDateTime dtm = LocalDateTime.now();
        System.out.println(dtm); // tarihi ve saati verir

        System.out.println(dtm.plusYears(1).plusMonths(2).plusDays(3).plusHours(4));
    }
}
