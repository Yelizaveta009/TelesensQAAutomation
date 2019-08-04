package lesson.three;

import java.util.Scanner;
import static java.lang.String.valueOf;

public class TaskSeventh {
        public static void main(String[] args) {
            System.out.println("Пример падиндрома: лезу в узел");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String original = scanner.nextLine();
            StringBuilder reverseOriginal = new StringBuilder();
            reverseOriginal.append(original);
            reverseOriginal = reverseOriginal.reverse();
            System.out.println(reverseOriginal);{
                if (valueOf(reverseOriginal).equals(original)) {
                    System.out.println("Эта строка является палиндромом");
                } else {
                    System.out.println("Эта строка НЕ является палиндромом");
                }
            }
        }
}

