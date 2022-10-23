package day19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01dateTime {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now(); // 2022-10-23
        LocalTime currentTime = LocalTime.now(); // 22:06:52.186918900

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-10-23T22:08:38.622536400

        LocalTime ctJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ctJapan); // 04:11:13.697480100

        LocalTime ctIst = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(ctIst); // 22:11:50.764761300

        // adding days
        currentDate.plusDays(500); // 2024-03-06

        LocalDate createDate = LocalDate.of(2022,10,23);
        // fixed date

        // date diff
        LocalDate nextYear = LocalDate.of(2023,3,14);
        System.out.println(ChronoUnit.DAYS.between(createDate,nextYear));
        // 142

        // adding time
        System.out.println(currentDate.plusYears(10).plusMonths(10).plusDays(10));
        // 2033-09-02

        nextYear.getDayOfMonth(); // 14
        nextYear.getMonth();  // MARCH
    }
}
