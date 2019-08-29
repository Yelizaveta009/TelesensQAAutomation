package homework.lesson06.six;
/* Перечисление для представления дней недели
Реализовать перечисление "День недели": Понедельник, Вторник, ...
В перечислении "День недели" добавить функции получения дня "позавчера" и "послезавтра".
Протестировать перечисление в функции main() тестового класса.*/

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DaysOfWeeks.printDays();
        DayTest firstDay = new DayTest(DayOfWeek.MONDAY);
        firstDay.nextDay();
        firstDay.lastDay();
    }
}
