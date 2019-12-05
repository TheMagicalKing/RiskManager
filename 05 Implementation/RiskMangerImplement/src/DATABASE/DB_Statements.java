package DATABASE;
import java.sql.*;
import java.util.ArrayList;


public class DB_Statements {

    private String user = DB_Con.getUsername();
    private String pass = DB_Con.getPassword();
    private static Statement stmt;
    String queryString;


    public void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/riskmanager?serverTimezone=UTC", this.user ,this.pass);
        System.out.println("Database connected.");
        stmt = connection.createStatement();
    }

    public void insertDB() throws SQLException {

        queryString = "insert into risktable(`desc`, prob, conseq, expo) values ('', 0, 0, 0);";
        stmt.executeQuery(queryString);

    }
    public void updateDB(String desc, int prob, int conseq) throws SQLException{
        int expo = prob*conseq;
        queryString = "update risktable set descrip = '"+desc+"', prob = "+prob+", conseq = "+conseq+", expo = "+expo+" where 'desc' like '%" + desc + "%';";

    }



}
