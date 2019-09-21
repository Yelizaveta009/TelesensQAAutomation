package homework.lesson10and11and12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Properties;
import java.util.Random;


public class Creator {
    private static String femaleFirstName = "female.firstnames.path";
    private static String femaleLastName = "female.lastnames.path";
    private static String maleFirstName = "male.firstnames.path";
    private static String maleLastName = "male.lastnames.path";
    private String firstNames;
    private String lastNames;
    private String genderName;
    private String numberPhone;
    private String operator;


    private enum Gender {
        MAN( maleFirstName, maleLastName ),
        WOMAN( femaleFirstName, femaleLastName );

        private String firstName;
        private String lastName;

        Gender(String name, String surName) {
            this.firstName = name;
            this.lastName = surName;
        }
    }

    private enum Operator {
        LIFE,
        KYIVSTAR,
        VODAFONE;
    }

    int getRandomNumber(String[] arr) {
        return Integer.parseInt( arr[(new Random()).nextInt( arr.length )] );
    }

    public void finalNumber() {
        Operator op = this.randomOperator();
        String[] arrayLife = {"38093", "38063", "38073"};
        String[] arrayVodafone = {"38050", "38095", "38066"};
        String[] arrayKyivstar = {"38097", "38067", "38098"};
        int balance = (int) (1000000 + (Math.random() * 8999999));
        if (op.equals( Operator.LIFE )) {
            numberPhone = getRandomNumber( arrayLife ) + Integer.toString( balance );
            operator = "Life";
        }
        if (op.equals( Operator.VODAFONE )) {
            numberPhone = getRandomNumber( arrayVodafone ) + Integer.toString( balance );
            operator = "Vodafone";

        } else if (op.equals( Operator.KYIVSTAR )) {
            numberPhone = getRandomNumber( arrayKyivstar ) + Integer.toString( balance );
            operator = "Kyivstar";
        }
    }

    public void finalInformation() {
        Gender gf = this.randomGender();
        if (gf.equals( Gender.MAN )) {
            firstNames = getFirstOrLast( Gender.MAN.firstName );
            lastNames = getFirstOrLast( Gender.MAN.lastName );
            genderName = "м";


        } else if (gf.equals( Gender.WOMAN )) {
            firstNames = getFirstOrLast( Gender.WOMAN.firstName );
            lastNames = getFirstOrLast( Gender.WOMAN.lastName );
            genderName = "ж";
        }
    }

    private Operator randomOperator() {
        return Operator.values()[new Random().nextInt( Operator.values().length )];
    }

    private Gender randomGender() {
        return Gender.values()[new Random().nextInt( Gender.values().length )];
    }

    public int age() {
        return (int) (Math.random() * 70) + 1;
    }

    public String getPropertiesPath(String currentPath) {
        Properties properties = new Properties();
        try {
            properties.load( new FileReader( "src/main/resources/java-part.properties" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty( currentPath );
    }

    public String getFirstOrLast(String currentPath) {
        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner s = new Scanner( new File( getPropertiesPath( currentPath ) ) );
            while (s.hasNext()) {
                list.add( s.next() );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list.get( random.nextInt( list.size() ) );
    }

    public void createExcel() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        for (int i = 0; i < 200; i++) {
            Row row = sheet.createRow( i );
            Cell idNumber = row.createCell( 0 );
            Cell cellSurname = row.createCell( 1 );
            Cell cellName = row.createCell( 2 );
            Cell gender = row.createCell( 3 );
            Cell cellAge = row.createCell( 4 );
            Cell cellNumber = row.createCell( 5 );
            Cell cellOperatorsName = row.createCell( 6 );

            finalInformation();
            idNumber.setCellValue( i + 1 );
            cellSurname.setCellValue(firstNames);
            cellName.setCellValue(lastNames);
            gender.setCellValue(genderName);
            cellAge.setCellValue(age());
            finalNumber();
            cellNumber.setCellValue(numberPhone);
            cellOperatorsName.setCellValue(operator);

            String excel = "subscriber.exc";
            String excelFilePath = getPropertiesPath( excel );
            try (FileOutputStream out = new FileOutputStream( new File( excelFilePath ) )) {
                workbook.write( out );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void createTxt() throws IOException {
        File file = new File( new Creator().getPropertiesPath( "subscriber.exc" ) );
        FileWriter fw = new FileWriter( new Creator().getPropertiesPath( "subscriber.txt" ) );
        PrintWriter pw = new PrintWriter( fw );
        try (XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream( file ) )) {
            XSSFSheet sheet = workbook.getSheet( "Sheet0" );

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow( i );
                int id = (int) row.getCell( 0 ).getNumericCellValue();
                String name = row.getCell( 1 ).getStringCellValue();
                String surname = row.getCell( 2 ).getStringCellValue();
                String gender = row.getCell( 3 ).getStringCellValue();
                int age = (int) row.getCell( 4 ).getNumericCellValue();
                String numberPhone = row.getCell( 5 ).getStringCellValue();
                String operator = row.getCell( 6 ).getStringCellValue();

                String info = String.format( id + ", " + name + ", " + surname + ", " + gender + ", " + age
                        + ", " + numberPhone + ", " + operator );

                pw.println( info );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        pw.close();
    }

    public void createToMap() throws IOException {
        Map<Integer, String> map = new HashMap<>();
        File file = new File( new Creator().getPropertiesPath( "subscriber.exc" ) );
        FileWriter fw = new FileWriter( new Creator().getPropertiesPath( "subscriber-map.txt" ) );
        PrintWriter pw = new PrintWriter( fw );
        try (XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream( file ) )) {
            XSSFSheet sheet = workbook.getSheet( "Sheet0" );

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow( i );
                int id = (int) row.getCell( 0 ).getNumericCellValue();
                String name = row.getCell( 1 ).getStringCellValue();
                String surname = row.getCell( 2 ).getStringCellValue();
                String gender = row.getCell( 3 ).getStringCellValue();
                int age = (int) row.getCell( 4 ).getNumericCellValue();
                String numberPhone = row.getCell( 5 ).getStringCellValue();
                String operator = row.getCell( 6 ).getStringCellValue();

                String info = String.format( name + ", " + surname + ", " + gender + ", " + age
                        + ", " + numberPhone + ", " + operator );

                map.put( id, info );

            }
            for (Map.Entry<Integer, String> item : map.entrySet()) {
                pw.println( item );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        pw.close();
    }

    public void readTxt() throws IOException {
        File file = new File( new Creator().getPropertiesPath( "subscriber.txt" ) );
        try {
            Scanner scanner = new Scanner( file );

            for (int n = 0; n < 10; n++) {
                System.out.println( scanner.nextLine() );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    public void fullBase() {
        File file = new File( new Creator().getPropertiesPath( "subscriber.exc" ) );
        try (XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream( file ) )) {
            XSSFSheet sheet = workbook.getSheet( "Sheet0" );
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow( i );
                int id = (int) row.getCell( 0 ).getNumericCellValue();
                String name = row.getCell( 1 ).getStringCellValue();
                String surname = row.getCell( 2 ).getStringCellValue();
                String gender = row.getCell( 3 ).getStringCellValue();
                int age = (int) row.getCell( 4 ).getNumericCellValue();

                switch (gender) {
                    case "м":
                        gender = "m";
                        break;
                    case "ж":
                        gender = "f";

                }

                PreparedStatement ps = connection.prepareStatement( "INSERT INTO abonent " +
                        "(abonent_id, first_name, last_name, gender, age) " +
                        "VALUES " +
                        "(?, ?, ?, ?, ?)" );

                {
                    ps.setInt( 1, id );
                    ps.setString( 2, name );
                    ps.setString( 3, surname );
                    ps.setString( 4, gender );
                    ps.setInt( 5, age );

                    ps.execute();
                }
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fullBaseOperator() {
        try {
            for (int i = 0; i <= 1000; i++) {
                String[] arrayLife = {"38093", "38063", "38073"};
                int balance = (int) (1000000 + (Math.random() * 8999999));
                String numberPhoneLife = getRandomNumber( arrayLife ) + Integer.toString( balance );
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
                PreparedStatement ps = connection.prepareStatement( "INSERT INTO operator_number" +
                        "(number,operator_id)" +
                        "VALUES" + "(?,?)" );

                ps.setString( 1, numberPhoneLife );
                ps.setInt( 2, 1 );
                ps.execute();
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i <= 1000; i++) {
                String[] arrayVodafone = {"38050", "38095", "38066"};
                int balance = (int) (1000000 + (Math.random() * 8999999));
                String numberPhoneVodafone = getRandomNumber( arrayVodafone ) + Integer.toString( balance );
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
                PreparedStatement ps = connection.prepareStatement( "INSERT INTO operator_number" +
                        "(number,operator_id)" +
                        "VALUES" + "(?,?)" );

                ps.setString( 1, numberPhoneVodafone );
                ps.setInt( 2, 2 );
                ps.execute();
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i <= 1000; i++) {
                String[] arrayKyivstar = {"38097", "38067", "38098"};
                int balance = (int) (1000000 + (Math.random() * 8999999));
                String numberPhoneKyivstar = getRandomNumber( arrayKyivstar ) + Integer.toString( balance );
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
                PreparedStatement ps = connection.prepareStatement( "INSERT INTO operator_number" +
                        "(number,operator_id)" +
                        "VALUES" + "(?,?)" );

                ps.setString( 1, numberPhoneKyivstar );
                ps.setInt( 2, 3 );
                ps.execute();
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void fullPhoneBook() {
            try{
                Class.forName( "com.mysql.cj.jdbc.Driver" );
                Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
                Statement statement = connection.createStatement();

                for (int i = 1; i <= 100; i++){
                    int abonent_id = i;
                    ResultSet phoneNumber = statement.executeQuery( "SELECT number FROM`qa-ja-07`.operator_number ORDER BY RAND() LIMIT 1" );
                    phoneNumber.next();
                    long phone = phoneNumber.getLong( "number" );
                    PreparedStatement ps = connection.prepareStatement( "INSERT IGNORE INTO phone_book" +
                            "(number,abonent_id)" +
                            "VALUES" + "(?,?)" );
                    ps.setLong( 1, phone);
                    ps.setInt( 2, abonent_id );
                    ps.execute();
                }

                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


