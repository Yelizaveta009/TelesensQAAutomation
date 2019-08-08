package lesson.seven;

import java.util.Comparator;

public class StringBySize implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int c1 = s1.length();
        int c2 = s2.length();

        if (c1 == c2)
            return 0;
        if (c1 < c2)
            return -1;
        else
            return 1;
    }
}
