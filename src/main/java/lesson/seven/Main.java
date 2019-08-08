package lesson.seven;
/*Заданную строку
	- разбить на слова
	- отсортировать слова по алфавиту не учитывая регистр первой буквы
	- отсортировать слова по длине
	- отсортировать слова по последней букве*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Bye Zero Main SortDemo lesson banana";
        String[] array;
        String delimeter = " ";
        array = str.split(delimeter);
        System.out.println(Arrays.toString(array));
        System.out.println("---Сортировка слов по алфавиту не учитывая регистр первой буквы---");
        Arrays.sort(array, new StringBySecondLetter());
        System.out.println(Arrays.toString(array));
        System.out.println("---Сортировка по длине---");
        Arrays.sort(array, new StringBySize());
        System.out.println(Arrays.toString(array));
        System.out.println("---Сортировка по последней букве---");
        Arrays.sort(array, new StringByLastLetter());
        System.out.println(Arrays.toString(array));
    }
}
