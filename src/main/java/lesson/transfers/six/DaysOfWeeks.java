package lesson.transfers.six;

public enum DaysOfWeeks {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static void printDays() {
        for (DaysOfWeeks d : values())
            System.out.println(d);
    }
}

