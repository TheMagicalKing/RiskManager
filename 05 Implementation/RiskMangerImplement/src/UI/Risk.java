package UI;

public class Risk {
    int id;
    String description;
    int probability;
    int consequence;
    int exposure;
    int revisedProbability;
    int revisedConsequence;

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

    public int getProbability() {
        return probability;
    }

    public int getConsequence() {
        return consequence;
    }

    public int getExposure(){
        exposure=getProbability()*getConsequence();
        return exposure;
    }

    public int getRevisedProbability() {
        return revisedProbability;
    }

    public int getRevisedConsequence() {
        return revisedConsequence;
    }

    public int getId(){
        return id;
    }
}
