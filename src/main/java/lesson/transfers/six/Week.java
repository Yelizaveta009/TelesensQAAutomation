package lesson.transfers.six;


public class Week {
    enum Day {
        MONDAY("Saturday"),
        TUESDAY("Sunday"),
        WEDNESDAY("Monday"),
        THURSDAY("Tuesday"),
        FRIDAY("Wednesday"),
        SATURDAY("Thursday"),
        SUNDAY("Friday");

        private String theDayBefore;

        Day(String theDayBefore) {
            this.theDayBefore = theDayBefore;
        }

        public String getTheDayBefore() {
            return theDayBefore;
        }

        static void printDays() {
            for (Week.Day d : values())
                System.out.println(d);
        }
    }
}
