package lesson.one;

public class TaskFirst {
    public static void main(String[] args) {
        if (args.length == 1) {
            String name = args[0];
            System.out.println(name + "Привет!");
        } else
            System.out.println("Привет!");
        System.out.println("Это моя первая программа. Я пишу на Java.");
        System.out.println("Программировать - это интересно.");
        System.out.println("Моя цель - научиться автоматизированному тестированию");
    }
}

