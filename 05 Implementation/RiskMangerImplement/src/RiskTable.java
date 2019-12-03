import java.util.ArrayList;

public class RiskTable{
    private ArrayList<Risk> risks = new ArrayList<>();

    public Risk addRisk(){return null;}
    public void sendRisk(Risk risk, String description, double probability, double consequence){
        if (risks.contains(risk)){

            System.out.println("No Risk Found");

        }
        else{
            risk.sendRisk(description, probability,consequence);
        }
    }
}