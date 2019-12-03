

public class Risk {
   private String description;
   private double probability;
   private double consequence;

   public void  sendRisk( String description, double probability, double consequence) {

       if (probability<0||consequence<0){
           System.out.println("Probability or Consequense is less than zero!");
       }else {
           System.out.println("Risk Updated!");
           this.description = description;
           this.probability = probability;
           this.consequence = consequence;
       }
   }
}


