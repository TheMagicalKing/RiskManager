package Logic;

import java.util.ArrayList;

public class RiskTable{
    private ArrayList<Risk> risks = new ArrayList<>();

    public Risk addRisk(){
        Risk risk = new Risk();
        risks.add(risk);
        //insert sql method call
        //vi skal også opdatere vores array-list hver gang vi ændre i sql tabellen
        return null;
    }
    //denne metode skal kalde en sql metode som opdatere en risk. vi finder id fra risken og sender det til sql metoden
    public void sendRisk(Risk risk, String description, double probability, double consequence){
        if (risks.contains(risk)){

            risk.sendRisk(description, probability,consequence);
        }
        else{
            System.out.println("No TEST.Risk Found");
        }
    }

    //vi skal have en metode som henter enten en arraylist eller en  fra database

    //nedenstående metoder er tilføjet uden UML og er nødvendige for at UI har adgang til listen
    public ArrayList<Risk> getRisks(){
        return risks;
    }

    public void deleteRist(int id) {
        getRisks().remove(getRisks().get(id-1));
    }
}