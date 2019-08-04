package lesson.transfers.six;


public class Main {
    public static void main(String[] args) {
        Week.Day.printDays();
        DayTest firstDay = new DayTest(Week.Day.MONDAY);
        firstDay.nextDay();
        firstDay.lastDay();
    }
}
