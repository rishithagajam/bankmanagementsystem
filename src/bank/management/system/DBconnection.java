package bank.management.system;

import java.sql.*;

public class DBconnection {

    Connection connection;
    Statement statement;

    public DBconnection() {

        try {

           Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "rishitha");

            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
