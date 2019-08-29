package classwork.lesson11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class LoggerDemo {
    private static final Logger LOG = LogManager.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        LOG.debug("Hello world direct to file logger");
        LOG.info("Hello world direct to console logger");
        String[] names = {"Kolya", "Lena", "Ira", "Valusha"};
        try {
            Arrays.stream(names)
                    .sorted((n1,n2)->Integer.compare(n1.length(),n2.length()))
                    .forEach(LOG::debug);
        } catch (Exception e) {
            LOG.error("Error", e.getMessage());
            throw e;
        }
    }
}
