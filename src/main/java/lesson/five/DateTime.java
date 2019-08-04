package lesson.five;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;


    public DateTime(int hour, int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void printTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        System.out.println("Original time: " + dateFormat.format(calendar.getTime()));
    }

    public void nextHour() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ");
        Calendar calendar = new GregorianCalendar(getYear(),getMonth(),getDay());
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.add(Calendar.HOUR, +25);
        System.out.println("nextHour: " + dateFormat.format(calendar.getTime()));
    }

    public void nextMinute() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ");
        Calendar calendar = new GregorianCalendar(getYear(),getMonth(),getDay());
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.add(Calendar.MINUTE, +61);
        System.out.println("nextMinute: " + dateFormat.format(calendar.getTime()));
    }

    public void nextSecond() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ");
        Calendar calendar = new GregorianCalendar(getYear(),getMonth(),getDay());
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.add(Calendar.SECOND, +61);
        System.out.println("nextSecond: " + dateFormat.format(calendar.getTime()));

    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public void printDateTime() {
        System.out.println("Строковое представление времени: " + toString());
    }
    public boolean checkTime() {
        if (hour != 0 && minute != 0 && second != 0) {
            System.out.println("Время инициализировано");
            return true;
        } else {
            System.out.println("Время не инициализировано");
            return false;
        }
    }
    public void printEndDateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ");
        Calendar calendar = new GregorianCalendar(getYear(),getMonth(),getDay());
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        System.out.println("Full date: " + dateFormat.format(calendar.getTime()));
    }
}

