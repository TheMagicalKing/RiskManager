public class RiskManagerControl {

    private RiskTable rt = new RiskTable();

    public static void main(String[] args) {
        System.out.println("Hej");
    }

    public void addRisk(RiskTable rT){
        if(rt==null){
            System.out.println("No Risk Table Found!");
        }else{
            rt.addRisk();
        }

    }
    public void sendRisk(Risk risk, String description,double probability,double consequence){

        rt.sendRisk(risk,description,probability,consequence);

    }

}
