package basisclass.time;

import sun.util.resources.cldr.ro.TimeZoneNames_ro;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println(timestamp);

        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println(specificTime);



        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);
    }
}
