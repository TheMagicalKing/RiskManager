package DATABASE;
import java.sql.*;

public class DB_Test {

    private static Statement stmt;


    public static void main(String[] args) throws SQLException {
        Connection con = null;
        con=DriverManager.getConnection("jdbc:mysql://localhost/RiskManager?serverTimezone=UTC", "root", "qtj38gve");

        stmt = con.createStatement();

        String queryString = "insert into risktable(descrip, prob, conseq, expo) values ('', 0, 0, 0);";
        stmt.execute(queryString);
        con.close();
    }
}