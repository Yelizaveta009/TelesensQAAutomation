package classwork.lesson09;

import java.util.*;
import java.util.stream.Stream;

public class Converter {
    // TODO - конвертировать List в массив
    public static Person[] convertListToArray(List<Person> list) {
        Person[] array = list.toArray(new Person[0]);
        return array;
    }

    // TODO - конвертировать массив в List
    public static ArrayList<Person> convertArrayToList(Person[] peopleArray) {
        ArrayList<Person> arrayList = new ArrayList<>(Arrays.asList(peopleArray));
        return arrayList;
    }

    // TODO - конвертировать массив в Map в качестве ключа взять поле model
    public static Map<Long, Person> convertArrayToMap(Person[] array) {
        Map<Long, Person> personHashMap = new HashMap<>();
        Stream.of(array).forEach(e -> personHashMap.put(e.id, e));
        return personHashMap;
    }

    // TODO - проверить, равны ли два списка
    public static boolean checkEqualLists(List<Person> list1, List<Person> list2) {
        if (list1.equals(list2)) {
            return true;
        } else {
            return false;
        }
    }
    // TODO - конвертировать Map в List
    public static List<String> convertMapToList(Map<Long, Person> map) {
        List<String> list3 = new ArrayList(map.values());
        return list3;
    }
}






