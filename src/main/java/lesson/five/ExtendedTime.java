package lesson.five;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExtendedTime extends DateTime {
    private int milliseconds;

    public ExtendedTime(int hour, int minute, int second, int milliseconds) {
        super(hour, minute, second);
        this.milliseconds = milliseconds;
    }
    public void printTimeExtended() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:S");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR, getHour());
        calendar.set(Calendar.MINUTE, getMinute());
        calendar.set(Calendar.SECOND, getSecond());
        calendar.set(Calendar.MILLISECOND, milliseconds);
        System.out.println("Extended Time: " + dateFormat.format(calendar.getTime()));
    }
}



