package basisclass.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExercise {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toLocalDate().format(DateTimeFormatter.ofPattern("uuuu-MM-dd")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("uuuu-MM-dd HH-mm ss")));
        System.out.println(now.toLocalDate().format(DateTimeFormatter.ofPattern("uuuu年MM月dd日")));
        System.out.println(now.toLocalDate().format(DateTimeFormatter.ofPattern("uuuu-MM-dd")));
    }
}
