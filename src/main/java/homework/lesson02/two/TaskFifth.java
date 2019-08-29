package homework.lesson02.two;

import java.util.Scanner;

public class TaskFifth {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш земной вес, пожалуйста : ");
    int weight = scanner.nextInt();

        System.out.println("Ваш вес на луне: " + (weight * 17) / 100 + ("kg"));
    }
}

