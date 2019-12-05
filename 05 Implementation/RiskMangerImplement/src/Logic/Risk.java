package Logic;

public class Risk {
    /*
   private String description;
   private double probability;
   private double consequence;
     */

   public Risk(){
       description="";
       probability=0;
       consequence=0;

   }

   public void  sendRisk( String description, double probability, double consequence) {

       if (probability<0||consequence<0){
           System.out.println("Probability or Consequense is less than zero!");
       }else {
           System.out.println("TEST.Risk Updated!");
           this.description = description;
           this.probability = probability;
           this.consequence = consequence;
       }
   }
   //alt det her er tilføjet, da tableview kræve særlige getters

    int id;
    String description;
    double probability;
    double consequence;
    double exposure;
    double revisedProbability;
    double revisedConsequence;

    public Risk(int id, String description, int probability, int consequence, int revisedProbability, int revisedConsequence){
        this.id=id;
        this.description=description;
        this.probability=probability;
        this.consequence=consequence;
        this.revisedProbability=revisedProbability;
        this.revisedConsequence=revisedConsequence;
    }

    public String getDescription() {
        return description;
    }

    public double getProbability() {
        return probability;
    }

    public double getConsequence() {
        return consequence;
    }

    public double getExposure(){
        exposure=getProbability()*getConsequence();
        return exposure;
    }

    public double getRevisedProbability() {
        return revisedProbability;
    }

    public double getRevisedConsequence() {
        return revisedConsequence;
    }

    public int getId(){
        return id;
    }
}


