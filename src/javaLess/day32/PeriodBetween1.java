package javaLess.day32;

import java.time.LocalDate;
import java.time.Period;

public class PeriodBetween1 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate brthday = LocalDate.of(1993,05,11);

        System.out.println(Period.between(brthday,today)); // P28Y10M24D

        System.out.println(Period.between(brthday,today).getYears()); // 28

        // FIXME: 4.04.2022

    }
}
