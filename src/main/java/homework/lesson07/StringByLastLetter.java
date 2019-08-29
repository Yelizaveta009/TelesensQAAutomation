package homework.lesson07;

import java.util.Comparator;

public class StringByLastLetter implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int c1 = s1.charAt(s1.length()-1);
        int c2 = s2.charAt(s2.length()-1);

        if (c1 == c2)
            return 0;
        if (c1 < c2)
            return -1;
        else
            return 1;
    }
}


