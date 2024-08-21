package bank.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connn {
    public Connection connection;
    public Statement statement;

    public Connn() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bankSystem", "postgres", "Abid678@");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
