package lesson.ten;


/*3) List
        a) создать список List целых чисел
        b) заполнить его случайными значениями 10-ти значных чисел, первый три цифры 999, остальные - любые, последняя заканчивается на 0 или 5. Не получилось, чтоб последняя 0 или 5((
        c) Вывести список на экран
        d) Проверить значения списка, с помощью регулярного выражения.???*/

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>(10);
        for (int i = 0; i < 10; i++) {
            long a = (9990000000l + (long) (Math.random() * 1000000));
            list.add(a);
    }
            System.out.println(list);
    }
}










