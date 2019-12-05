package Logic;

import java.util.ArrayList;

public class RiskManagerControl {

    private Logic.RiskTable rt = new Logic.RiskTable();

    public void addRisk(){
        if(rt==null){
            System.out.println("No TEST.Risk Table Found!");
        }else{
            rt.addRisk();
        }
    }
    public void sendRisk(Logic.Risk risk, String description, double probability, double consequence){
        rt.sendRisk(risk,description,probability,consequence);
    }

    public ArrayList<Risk> getRisks(){
        return rt.getRisks();
    }
}
