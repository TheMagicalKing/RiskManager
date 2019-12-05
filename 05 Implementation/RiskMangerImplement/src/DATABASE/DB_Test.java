package DATABASE;
import java.sql.*;

public class DB_Test {

    private static Statement stmt;

    public static void main(String[] args) throws SQLException {

        String password = DB_Con.getPassword();
        String username = DB_Con.getUsername();
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/riskmanager", username, password);
        System.out.println("Database connected.");
        stmt = connection.createStatement();
       /** ResultSet s = stmt.executeQuery("select desc from risktable");
        System.out.println(s.getString("desc"));**/
    }

}
