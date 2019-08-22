package lesson.second;
/*Составьте лямбда-выражение, которое возвращает значение true, если
		число принадлежит к диапазону чисел 10-20, включая граничные значения*/

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x >= 10 && x <= 20;

        System.out.println(isPositive.test(10)); // true
        System.out.println(isPositive.test(2)); // false
    }
}

