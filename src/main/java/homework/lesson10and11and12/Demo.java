package homework.lesson10and11and12;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        Creator creator = new Creator();

        //Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными
        creator.createExcel();

        //Java приложение которое конвертирует excel в txt
        creator.createTxt();

        //Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt
        creator.createToMap();

        // Прочитать 1-ый десять строк файла subscribers.txt и вывести на экран
        creator.readTxt();

        //Наполняет таблицу абонентов (200).Данные взяты из эксель файла.
        creator.fullBase();

        // Наполнить таблицу operator_number телефонными номерами для каждого оператора по 10000 номеров:
        creator.fullBaseOperator();

        //Наполнить таблицу phone_book:
        //		- 	в случайном порядке брать свободный номер из operator_number
        //			и привязать к случайно взятому абоненту из таблицы subscriber
        creator.fullPhoneBook();

    }
}



