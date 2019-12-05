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

    //denne er tilføjet, men mangler UML!
    public void deleteRisk(int id){
        System.out.println("This is a coming feature");
        rt.deleteRist(id);
    }

    //denne metode skal være der for at ui har adgang til indhold i listen.
    public ArrayList<Risk> getRisks(){
        return rt.getRisks();
    }
}
