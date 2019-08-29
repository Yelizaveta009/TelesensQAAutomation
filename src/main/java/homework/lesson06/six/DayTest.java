package homework.lesson06.six;

import java.time.DayOfWeek;

public class DayTest {
    DayOfWeek day;

    public DayTest(DayOfWeek day) {
        this.day = day;
    }

    public void nextDay() {
        if (day.ordinal() == 5) {
            System.out.println("The day after tomorrow will be MONDAY ");
        } else if (day.ordinal() == 6) {
            System.out.println("The day after tomorrow will be TUESDAY ");
        } else {
            System.out.println("The day after tomorrow will be " + DaysOfWeeks.values()[day.ordinal() + 2]);
        }
    }

    public void lastDay() {
        if (day.ordinal() == 0) {
            System.out.println("The day before yesterday was SATURDAY ");
        } else if (day.ordinal() == 1) {
            System.out.println("The day before yesterday was SUNDAY ");
        } else {
            System.out.println("The day before yesterday was " + DaysOfWeeks.values()[day.ordinal() - 2]);
        }
    }
}

