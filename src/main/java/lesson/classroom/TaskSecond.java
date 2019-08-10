package lesson.classroom;
/*"Constructor" => превратить в char[] => отсортировать => снова в String. Тут я не уверена, что поняла и выполнила правильно это задание. */

import java.util.Arrays;

public class TaskSecond {
    public static void main(String[] args) {
        String str = "Constructor";
        System.out.println("String: " + str);
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        java.util.Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
        String valueOfchar = String.valueOf(charArray);
        System.out.println("Sorted string: " + valueOfchar);
    }
}
