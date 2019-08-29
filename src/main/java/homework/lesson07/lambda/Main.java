package homework.lesson07.lambda;

import static homework.lesson07.lambda.LambdaArgumentDemo.changeStr;
/*3)Создайте лямбда-выражение, которое переводит строку в верхний режим.
        Перевести строку в верхний регистр с помощью лямбда-выражения.
        Перевести строку в верхний регистр с помощью ссылки на метод.
  5) Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.
	Продемонстрируйте работу лямбда-выражения.*/

public class Main {
    public static void main(String[] args) {
            String inStr = "Уже час ночи, но у меня все получится";
            System.out.println("Исходная строка: " + inStr);

            String toUpperStr = changeStr((str) -> {
                String result = "";
                char ch;

                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                        result += Character.toUpperCase(ch);
                }
                return result;}, inStr);

            System.out.println("Новая строка: "+ toUpperStr);

            String withoutSpaces = changeStr ((str) -> str.replaceAll("\\s",""), inStr);
            System.out.println("Cтpoкa без пробелов: " + withoutSpaces);
            }
    }



