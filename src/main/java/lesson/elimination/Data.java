package lesson.elimination;
/* Исключения*/

import java.util.Objects;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return day == data.day &&
                month == data.month &&
                year == data.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "Data:" + day +
                "." + month +
                "." + year;

    }

    public boolean checkDate() throws IllegalDateException {
        if (day > 0 & day < 31 & month > 0 & month < 12 & year > 0 & year < 3000) {
            return true;
        } else try {
            throw new IllegalDateException("Incorrect Date");
        } catch (Exception e) {
            System.out.println(new IllegalDateException("Incorrect Date").explanation());
        }
        return false;
    }
}




