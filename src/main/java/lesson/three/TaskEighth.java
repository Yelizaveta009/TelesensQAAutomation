package lesson.three;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskEighth {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число: ");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        Integer[] numbers = new Integer[z];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = ((int) (Math.random() * 100));{
            System.out.println("Исходный массив: " + Arrays.toString(numbers));
            Arrays.sort(numbers, Collections.reverseOrder());
            System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(numbers));
            java.util.Arrays.sort(numbers);
            System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(numbers));
        }
    }
}

