package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DB_Statements {

    private Connection con;
    private static Statement stmt;
    String queryString;

    public void insertDB() throws SQLException {
        Connection con = null;
        con=DriverManager.getConnection("jdbc:mysql://localhost/RiskManager?serverTimezone=UTC", "root", "qtj38gve");

        stmt = con.createStatement();

        queryString = "insert into risktable(descrip, prob, conseq, expo) values ('', 0, 0, 0);";
        stmt.execute(queryString);
        con.close();

    }
/*
    public void updateDB(int rid, String desc, int prob, int conseq) throws SQLException{
        Connection con = null;
        con=DriverManager.getConnection("jdbc:mysql://localhost/RiskManager?serverTimezone=UTC", "root", "qtj38gve");
        Statement stmt2 = con.createStatement();
        int expo = prob*conseq;
        queryString = "update risktable set descrip = '"+desc+"', prob = "+prob+", conseq = "+conseq+", expo = "+expo+" where id = "+ rid + ";";
        stmt2.execute(queryString);
        con.close();
    }

    public void deleteRisk(int rid) throws SQLException {
        con = DB_Con.getConnection();
        stmt = con.createStatement();
        queryString = "delete from risktable where id ="+rid+";";
        stmt.executeQuery(queryString);
        con.close();
    }
    public void showAllDB() throws SQLException {
        con = DB_Con.getConnection();
        stmt = con.createStatement();
        queryString = "select * from risktable";
        stmt.executeQuery(queryString);
        con.close();
    }


     */


}
