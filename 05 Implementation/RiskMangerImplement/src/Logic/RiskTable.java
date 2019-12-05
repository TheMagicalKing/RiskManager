package Logic;

import DATABASE.DB_Statements;

import java.sql.*;
import java.util.ArrayList;

public class RiskTable{
    private ArrayList<Risk> risks = new ArrayList<>();

    public Risk addRisk() /**throws SQLException  Made addRisk throw SQLException to comply with SQL's Demands :C**/ {
        //TODO this should tell the ui to add this risk to its observable list, as well as send the new risk to database

        /**DB_Statements insert = new DB_Statements();
        insert.insertDB();**/
        Risk risk = new Risk();
        risks.add(risk);
        return null;
    }
    public void sendRisk(Risk risk, String description, double probability, double consequence){
        if (risks.contains(risk)){
            risk.sendRisk(description, probability,consequence);
        }
        else{
            System.out.println("No TEST.Risk Found");
        }
    }

    //nedenstående metoder er tilføjet uden UML
    public ArrayList<Risk> getRisks(){
        return risks;
    }

    public void deleteRist(int id) {
        getRisks().remove(getRisks().get(id-1));
    }
}