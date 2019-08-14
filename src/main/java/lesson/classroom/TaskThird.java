package lesson.classroom;
/*3)* "track_23", "track_12", "track_06", "track_22"
	=> отсортировать по номеру из последних двух цифр. */

import java.util.*;

public class TaskThird {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("track_23", "track_12", "track_06", "track_22");

        stringList
                .stream()
                .sorted(
                        (e1, e2) -> {
                            String s1 = e1.substring(6);
                            String s2 = e2.substring(6);

                            int result = s1.compareTo(s2);
                            if (result != 0) return result;

                            return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
                        }
                ).forEach(System.out::println);
    }
}











