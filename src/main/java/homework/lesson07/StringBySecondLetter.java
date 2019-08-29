package homework.lesson07;

import java.util.Comparator;

public class StringBySecondLetter implements Comparator<String> {
    private static final int INDEX_LETTER = 1;

    @Override
    public int compare(String s1, String s2) {
        char c1 = s1.charAt(INDEX_LETTER);
        char c2 = s2.charAt(INDEX_LETTER);

        if (c1 == c2)
            return 0;
        if (c1 < c2)
            return -1;
        else
            return 1;
    }
}

