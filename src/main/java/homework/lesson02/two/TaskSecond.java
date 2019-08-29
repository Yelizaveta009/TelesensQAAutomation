package homework.lesson02.two;

import java.util.Scanner;

public class TaskSecond {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int z = in.nextInt();{
            System.out.println("number = " + z);
            System.out.println("result = " + z * z);
        }
    }
}

