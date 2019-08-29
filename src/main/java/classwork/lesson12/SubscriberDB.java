package classwork.lesson12;

import java.sql.*;

public class SubscriberDB {
    public static void main(String[] args) {
     /*   try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery( "SELECT * FROM abonent" );

            while (rs.next()) {
                String first_name = rs.getString( "first_name" );
                String last_name = rs.getString( "last_name" );
                String gender = rs.getString( "gender" );
                int age = rs.getInt( "age" );
                System.out.println( first_name + " " + last_name + " " + gender + " " + age );//ЭТО ПЛОХО!
            }

            rs.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=[htydfvdctv&serverTimezone=UTC&useSSL=false" );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery( "SELECT * FROM abonent" );

            while (rs.next()) {
                String first_name = rs.getString( "first_name" );
                String last_name = rs.getString( "last_name" );
                String gender = rs.getString( "gender" );
                int age = rs.getInt( "age" );
                System.out.println( first_name + " " + last_name + " " + gender + " " + age );
            }
PreparedStatement ps = connection.prepareStatement  ("INSERT INTO abonent VALUES(?, ?, ?, ?, ?)");

            ps.setInt(1, 25);
            ps.setString(2, "Boris");
            ps.setString(3, "Tkachenko");
            ps.setString(4, "m");
            ps.setInt(5,26);

            ps.execute();

            rs.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}