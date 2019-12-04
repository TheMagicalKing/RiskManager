package Logic;

import java.util.ArrayList;

public class RiskTable{
    private ArrayList<Risk> risks = new ArrayList<>();

    public Risk addRisk(){
        //TODO this should tell the ui to add this risk to its observable list, as well as send the new risk to database
        Risk risk = new Risk();
        risks.add(risk);
        return null;
    }
    public void sendRisk(Risk risk, String description, double probability, double consequence){
        if (risks.contains(risk)){

            System.out.println("No TEST.Risk Found");

        }
        else{
            risk.sendRisk(description, probability,consequence);
        }
    }
}