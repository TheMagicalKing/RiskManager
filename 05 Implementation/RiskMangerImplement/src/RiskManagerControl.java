public class RiskManagerControl {

    private RiskTable rt = new RiskTable();

    public static void main(String[] args) {
        System.out.println("Hej");
    }

    public Risk addRisk(){
        return null;
    }
    public void sendRisk(Risk risk, String description,double probability,double consequence){

        rt.sendRisk(risk,description,probability,consequence);

    }

}
