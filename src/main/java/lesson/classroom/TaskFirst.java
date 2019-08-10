package lesson.classroom;
/* 1) "Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris" 15
	Массив => Вывести все => вывести только имена => вывести только числа*/

import java.util.Arrays;

public class TaskFirst {
    public static void main(String[] args) {
        Object[] base = new Object[]
                {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};
        System.out.println(Arrays.asList(base));

        System.out.println("----Только цифры----");
        for (int i = 0; i < base.length; i++) {
            if (base[i] instanceof Integer)
                System.out.println((base[i]));
        }
        System.out.println("----Только имена----");
            for (int i = 0; i < base.length; i++) {
                if (base[i] instanceof String)
                    System.out.println((base[i]));
        }
    }
}
