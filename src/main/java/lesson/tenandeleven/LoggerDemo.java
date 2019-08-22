package lesson.tenandeleven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class LoggerDemo {
    private static final Logger LOG = LogManager.getLogger( LoggerDemo.class.getName() );

    public static void main(String[] args) {
        Creator creator = new Creator();

        try {
            LOG.info("Info about person");
            creator.readTxt();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        }
    }
}
