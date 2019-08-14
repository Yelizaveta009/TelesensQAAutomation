package lesson.classroom09;

import java.util.*;
import static lesson.classroom09.Converter.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(8L, 15, "Peter"));
        list.add(new Person(5L, 24, "Liza"));
        list.add(new Person(84, 32, "Helen"));
        Person[] peopleArray = convertListToArray(list);//конвертация листа в массив.
        System.out.println(Arrays.toString(peopleArray));
        ArrayList<Person> list2 = convertArrayToList(peopleArray);//конвертация массива в лист.
        System.out.println(list2);
        Map<Long, Person> personHashMap = convertArrayToMap(peopleArray);//конвертация массива в map.
        for(Map.Entry<Long, Person> item : personHashMap.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());}
            System.out.println(checkEqualLists(list,list2));//проверка, равны ли два списка.
        List<String> list3 = convertMapToList(personHashMap);//конвертация map в list.
        System.out.println(list3);
    }
}


