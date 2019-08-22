package lesson.nine;

/*3) List
        a) создать список List целых чисел
        b) заполнить его случайными значениями 10-ти значных чисел, первый три цифры 999, остальные - любые, последняя заканчивается на 0 или 5.
        c) Вывести список на экран
        d) Проверить значения списка, с помощью регулярного выражения.???*/

import java.util.ArrayList;
import java.util.List;

public class TaskThird {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>(10);
        for (int i = 0; i < 10; i++) {
            Long a = getNumber();
            list.add(a);
        }
        System.out.println(list);
    }
    public static long getNumber(){
        long a = 9990000000L + (long)(Math.random()*100000L);
        if ( a % 5 == 0) return a;
        else return getNumber();
    }
}










