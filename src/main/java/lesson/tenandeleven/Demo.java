package lesson.tenandeleven;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        Creator creator = new Creator();

        //Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными
        creator.createExcel();
        //Java приложение которое конвертирует из excel в txt
        creator.createTxt();

        //Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt
        creator.createToMap();

        // Прочитать 1-ый десять строк файла subscribers.txt и вывести на экран
        creator.readTxt();
    }
}



