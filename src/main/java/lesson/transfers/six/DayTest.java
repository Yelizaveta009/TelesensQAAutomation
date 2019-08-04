package lesson.transfers.six;

public class DayTest {
    Week.Day day;

    public DayTest(Week.Day day) {
        this.day = day;
    }

    public void nextDay() {

        switch (day) {
            case MONDAY:
                System.out.println("The day after tomorrow will be Wednesday");
                break;
            case TUESDAY:
                System.out.println("The day after tomorrow will be Thursday");
                break;
            case WEDNESDAY:
                System.out.println("The day after tomorrow will be Friday");
                break;
            case THURSDAY:
                System.out.println("The day after tomorrow will be Saturday");
                break;
            case FRIDAY:
                System.out.println("The day after tomorrow will be Sunday");
                break;
            case SATURDAY:
                System.out.println("The day after tomorrow will be Monday");
                break;
            case SUNDAY:
                System.out.println("The day after tomorrow will be Tuesday");
                break;

        }
    }
    public void lastDay() {
        System.out.println("The day before yesterday was " + day.getTheDayBefore());
    }
}

