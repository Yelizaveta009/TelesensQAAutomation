package lesson.ten;
/*1) Дан массив имен: {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max}
	a) Создать список List из элементов массива и вывести на экран
	b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
	c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
	d) Поменять имя Helen на Elizabet
	e) Отсортировать имена по алфавиту и вывести на экран
	f) Отсортировать имена в обратном порядке и вывести имена на экран
	g) Перевести все первые символы в верхний регистр
	h) Вывести все имена, начинающиеся на букву A
	i) Проверить, содержит ли список имя Andrey
	j) Удалить из списка все имена кроме Kate и Helen*/

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class HomeTask {
    public static void main(String[] args) {
        String[] person = {"Peter", "Helen", "ivan", "Abdel", "zina", "Veronica", "Leonid", "Alex", "Andrey","Kate","Helen"};
        ArrayList<String> personList = new ArrayList<>(Arrays.asList(person));//a) Создать список List из элементов массива.
        personList.add("Philip");                         //Добавить 3 новых имени в список (Philip, Joseph, Leon)
        personList.add("Joseph");
        personList.add("Leon");
        personList.forEach(System.out::println);
        System.out.println("---------------------------");
        personList.set(1,"Elizabeth");                    //Поменять имя Helen на Elizabet
        personList.forEach(System.out::println);
        System.out.println("---------------------------");
        personList.stream()                               // Перевести все первые символы в верхний регистр
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
        System.out.println("---------------------------");
        Collections.sort(personList);                     // Отсортировать имена по алфавиту и вывести на экран
        personList.forEach(System.out::println);
        System.out.println("---------------------------");
        Collections.reverse(personList);                  // Отсортировать имена в обратном порядке и вывести имена на экран
        personList.forEach(System.out::println);
        System.out.println("---------------------------");
        personList.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
        System.out.println("---------------------------");
        personList.stream().filter(str -> str.startsWith("A"))// Вывести все имена, начинающиеся на букву A
                .forEach(System.out::println);
        System.out.println("---------------------------");
        boolean contains = personList.stream().anyMatch("Andrey"::equals);
        System.out.println(contains);// Проверить, содержит ли список имя Andrey
        personList.removeIf(n -> (n.charAt(0) != 'K' & n.charAt(0) != 'H'));// Удалить из списка все имена кроме Kate и Helen*/
        System.out.println("---------------------------");
        personList.forEach(System.out::println);
    }
}


