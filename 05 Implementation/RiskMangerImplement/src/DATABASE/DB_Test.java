package DATABASE;
import java.sql.*;

public class DB_Test {

    private static Statement stmt;


    public static void main(String[] args) throws SQLException {
        DB_Statements insert = new DB_Statements();
        insert.insertDB();
        System.out.println("Alls good boss!");

    }

}
