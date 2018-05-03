package basisclass.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DateAPIUtilities {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear() + " " + today.isLeapYear());

        System.out.println(today.isAfter(today.plusDays(1)));


        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(lastDayOfYear);

        Period period = today.until((lastDayOfYear));
        System.out.println(period);
        System.out.println(period.getMonths());
    }
}
