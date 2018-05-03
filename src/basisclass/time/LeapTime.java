package basisclass.time;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class LeapTime {
    public static void main(String[] args) {
        Year year = Year.of(2012);
        YearMonth yearMonth = year.atMonth(2);
        LocalDate localDate = yearMonth.atDay(29);

        System.out.println(localDate);

        System.out.println(localDate.isLeapYear());

        MonthDay monthDay = MonthDay.of(2, 29);
        LocalDate leapYear = monthDay.atYear(2012);
        System.out.println(leapYear);
        System.out.println(leapYear.isLeapYear());

        LocalDate nonLeapYear = monthDay.atYear(2013);
        System.out.println(nonLeapYear);
        System.out.println(nonLeapYear.isLeapYear());
    }
}
