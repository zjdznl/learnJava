package basisconcept.enumtest;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.MONDAY));
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SUNDAY));
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SATURDAY));

        System.out.println(WeekEnum.MONDAY.name());
        System.out.println(WeekEnum.MONDAY.getDate());
        System.out.println(WeekEnum.MONDAY);

        for (WeekEnum we : WeekEnum.values()) {
            System.out.println(we + " " + we.name());
        }

        System.out.println("========");
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "MONDAY"));
    }
}
