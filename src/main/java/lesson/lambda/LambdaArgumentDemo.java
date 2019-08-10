package lesson.lambda;

public class LambdaArgumentDemo {
    static String changeStr(Lambda.StringFunc sf, String s) {
        return sf.func(s);
    }
}
