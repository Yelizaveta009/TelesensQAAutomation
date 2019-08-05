package lesson.five;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.day = 01;
        this.month = 0;
        this.year = 1970;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        if (day > 0 && day < 31 && month > 0 && month < 12 && year > 0 && year < 3000) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Введите корректную дату(день.мм.год.");
        }
    }

    public void printDataCalendar() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        System.out.println("Original date: " + dateFormat.format(calendar.getTime()));
    }

    public void nextDay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        calendar.add(Calendar.DATE, +1);
        System.out.println("Next day: " + dateFormat.format(calendar.getTime()));
    }

    public void nextMonth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        calendar.add(Calendar.MONTH, +1);
        System.out.println("Next month: " + dateFormat.format(calendar.getTime()));
    }

    public void nextYear() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        calendar.add(Calendar.YEAR, +1);
        System.out.println("Next year: " + dateFormat.format(calendar.getTime()));
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public void printDate() {
        System.out.println("Строковое представление даты: " + toString());

    }

    public void getDayOfWeek() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        System.out.println("День недели: " + dateFormat.format(calendar.getTime()));
    }

    public void getWeekOfYear() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("w");
        Calendar calendar = new GregorianCalendar(this.year, this.month, this.day);
        System.out.println("Номер недели в году: " + dateFormat.format(calendar.getTime()));
    }
}

