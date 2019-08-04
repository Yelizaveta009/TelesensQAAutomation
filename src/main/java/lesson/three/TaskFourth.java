package lesson.three;

import java.util.Scanner;

public class TaskFourth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя и номер телефона: ");
        String info = scanner.nextLine();
        String name = info.replaceAll("[^A-Za-z]","");
        String numbers = info.replaceAll("\\D+","");
        System.out.println("Имя и номер: "+info);
        System.out.println("Только имя: "+name);
        System.out.println("Только номер:"+numbers);
    }
}
