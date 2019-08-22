package lesson.nine;
/*2) List
        a) создать список целых чисел
        b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
        c) вывести список на экран
        d) вывести минимальное, максимально значения
        e) вывести сумму чисел на экран
     */

import java.util.ArrayList;
import java.util.List;

public class TaskSecond {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 100)+1;
            list.add(x);
        }
        System.out.println(list);
        System.out.println("Максимальное значение: "+list.stream().max(Integer::compare).get());
        System.out.println("Минимальное значение: "+list.stream().min(Integer::compare).get());
        System.out.println("Cумма чисел: " +list.stream().mapToInt(Integer::intValue).sum());
    }
}

