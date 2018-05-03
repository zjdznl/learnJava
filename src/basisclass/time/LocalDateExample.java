package basisclass.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate firstDay_2018 = LocalDate.of(2018, Month.JANUARY, 1);
        System.out.println(firstDay_2018);

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(todayKolkata);

        LocalDate dateFromBase = LocalDate.ofEpochDay(0);
        System.out.println(dateFromBase);

        LocalDate hundredFay2018 = LocalDate.ofYearDay(2018, 100);
        System.out.println(hundredFay2018);
    }
}
