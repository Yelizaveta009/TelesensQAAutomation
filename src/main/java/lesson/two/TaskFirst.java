package lesson.two;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.print("Input a third number: ");
        int num3 = in.nextInt();
        {
            if (num1 > num2 && num1 > num3) {
                System.out.println("Большее число из 3 чисел: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("Большее число из 3 чисел: " + num2);
            } else {
                System.out.println("Большее число из 3 чисел: " + num3);
            }
            {
                if (num1 < num2 && num1 < num3) {
                    System.out.println("Найменьшее число из 3 чисел: " + num1);
                } else if (num2 < num1 && num2 < num3) {
                    System.out.println("Найменьшее число из 3 чисел: " + num2);
                } else {
                    System.out.println("Найменьшее число из 3 чисел: " + num3);}{
                System.out.println("Среднее арифметическое: " + (num3+num2+num3)/3); }
            }
        }
    }
}

