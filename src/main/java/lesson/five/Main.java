package lesson.five;

public class Main {
    public static void main(String[] args) {
        Date dateFirst = new Date (1,0,1970);
        Date dateSecond= new Date (25,0,1970);
        DateTime dateTimeFirst = new DateTime(15,30,10);
        DateTime dateTimeSecond = new DateTime(15,30,10);
        ExtendedTime  dateTimeFirstMilliseconds = new ExtendedTime(15,30,10,357);
        dateFirst.printDate();
       dateFirst.printDataCalendar();
       dateFirst.nextDay();
       dateFirst.nextMonth();
       dateFirst.nextYear();
       dateFirst.getDayOfWeek();
       dateFirst.getWeekOfYear();
       System.out.println("-------------------------------------------------");
       dateTimeFirst.printDateTime();
       dateTimeFirst.printTime();
       dateTimeFirst.printEndDateTime();
       dateTimeFirst.nextHour();
       dateTimeFirst.nextMinute();
       dateTimeFirst.nextSecond();
       dateTimeFirst.checkTime();
       System.out.println("-------------------------------------------------");
       dateTimeFirstMilliseconds.printTimeExtended();
       System.out.println("-------------------------------------------------");
       System.out.println(dateFirst.equals(dateSecond));
       System.out.println(dateTimeFirst.equals(dateTimeSecond));
    }
}
