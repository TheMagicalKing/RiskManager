package DATABASE;
import java.sql.*;

public class DB_Test {

    private static Statement stmt;


    public static void main(String[] args) throws SQLException {

        String user = DB_Con.getUsername();
        String pass = DB_Con.getPassword();
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/riskmanager?serverTimezone=UTC", user,pass);
        System.out.println("Database connected.");
        stmt = connection.createStatement();
        String queryString = "select * from risktable";
        ResultSet s = stmt.executeQuery(queryString);
        while (s.next())
        System.out.println(s.getString("Prob"));
    }

}
