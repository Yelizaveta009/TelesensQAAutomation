package homework.lesson03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFirst {
        public static void main(String[] args) {
            String Users = ("Nataly Dasha Alyona Darina Diana Daniel Boris Mike Konstantin Kirill");
            System.out.println(Users);
            Pattern pattern = Pattern.compile("D(\\w*)");
            Matcher matcher = pattern.matcher(Users);
            System.out.println("Names that begin with the letter D: ");
            while(matcher.find())
                System.out.println(matcher.group(0));
        }
}

