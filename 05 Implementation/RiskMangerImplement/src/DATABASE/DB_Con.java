package DATABASE;

//import javax.swing.*;
import java.sql.*;

public class DB_Con {
    private static String url = "jdbc:mysql://localhost/riskmanager?ServerTimezone=UTC";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "1";
    private static Connection con;


    public static Connection getConnection() {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/riskmanager?ServerTimezone=UTC", "root", "1");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }

        return con;
    }
}
