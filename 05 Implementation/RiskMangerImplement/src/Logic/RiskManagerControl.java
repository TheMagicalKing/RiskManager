package Logic;

public class RiskManagerControl {

    private Logic.RiskTable rt = new Logic.RiskTable();

    public void addRisk(Logic.RiskTable rT){
        if(rt==null){
            System.out.println("No TEST.Risk Table Found!");
        }else{
            rt.addRisk();
        }
    }
    public void sendRisk(Logic.Risk risk, String description, double probability, double consequence){
        rt.sendRisk(risk,description,probability,consequence);
    }
}
