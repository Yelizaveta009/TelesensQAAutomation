package homework.lesson02.two;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFirstSecondVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[3];
        System.out.println("Введите три натуральных числа: ");
        for (int i = 0; i < 3; i++){
            num[i] = input.nextInt();}
        System.out.println();
        double sum = 0;
        for (int x : num){
            sum += x;}
        System.out.println("Среднее арифметическое чисел равно: " + sum / num.length);{
            int max = num[0];
            for (int i = 1; i < num.length; i++) max = Math.max(max, num[i]);
            System.out.println("Наибольшее число: " + max);}
        int min = num[0];
        for (int i = 1; i < num.length; i++) min = Math.min(min, num[i]);
        System.out.println("Наименьшее число: " + min);{
            System.out.print("Порядок числ по возрастанию: \n");
            Arrays.sort(num);
            for (int i = 0; i < num.length; i++)
                System.out.print(num[i] + "  ");
        }
    }
}


