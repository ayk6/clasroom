package day19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C02dateTime {
    public static void main(String[] args) {
        // date time formatting // dtf returns string

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(dtf.format(currentDate)); // 23.10.22

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("ddMMMyy");
        System.out.println(dtf2.format(currentDate)); // 23Oct22

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("ddMMMMyyy");
        System.out.println(dtf3.format(currentDate)); // 23October2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d.MM.yy");
        // can print one digit days. not 01,02...
    }
}
