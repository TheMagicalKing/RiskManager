package UI;

import Logic.Risk;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class RiskTable {
    TableView<Logic.Risk> table;
    ArrayList<Logic.Risk> logicRisks;
    ObservableList<Logic.Risk> risks = FXCollections.observableArrayList();
    Main main;

    public RiskTable(Main main, ArrayList<Logic.Risk> logicRisks){
        this.main=main;
        this.logicRisks = logicRisks;
        risks.addAll(logicRisks);
    }

    public void deleteRisk(int id){
        for (Logic.Risk risk : risks){
            if (risk.getId()==id){
                System.out.println("we got a risk with the id:"+id);
                risks.remove(risk);
                break;
            }
            System.out.println("we did not find a risk with the id:"+id);
        }
        table.setItems(getRisks());
    }

    public void addRisk(/*int id, String description, int probability, int consequence, int revisedProbability, int revisedConsequence*/){
        //for some reason this line also deletes all elements in risks list
        //table.getItems().clear();
        //risks.add(new Risk(id, description, probability, consequence, revisedProbability, revisedConsequence));
        table.setItems(getRisks());
    }

    public ObservableList<Logic.Risk> getRisks(){
        risks.removeAll(logicRisks);
        risks.addAll(logicRisks);
        return risks;
    }

    public TableView<Risk> getTable(){
        table = new TableView<>();
        //id column
        TableColumn<Logic.Risk,Integer> idColumn = new TableColumn<>("Id");
        idColumn.setMinWidth(25);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        //description column
        TableColumn<Logic.Risk,String> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setMinWidth(100);
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        //probability column
        TableColumn<Logic.Risk,Integer> probabilityColumn = new TableColumn<>("Probability");
        probabilityColumn.setMinWidth(100);
        probabilityColumn.setCellValueFactory(new PropertyValueFactory<>("probability"));
        //consequence column
        TableColumn<Logic.Risk,Integer> consequenceColumn = new TableColumn<>("Consequence");
        consequenceColumn.setMinWidth(100);
        consequenceColumn.setCellValueFactory(new PropertyValueFactory<>("consequence"));
        //exposure column
        TableColumn<Logic.Risk,Integer> exposureColumn = new TableColumn<>("Exposure");
        exposureColumn.setMinWidth(100);
        exposureColumn.setCellValueFactory(new PropertyValueFactory<>("exposure"));
        //revisedProbability column
        TableColumn<Logic.Risk,Integer> revisedProbabilityColumn = new TableColumn<>("RevisedProbability");
        revisedProbabilityColumn.setMinWidth(100);
        revisedProbabilityColumn.setCellValueFactory(new PropertyValueFactory<>("revisedProbability"));
        //revisedConsequence column
        TableColumn<Logic.Risk,Integer> revisedConsequenceColumn = new TableColumn<>("RevisedConsequence");
        revisedConsequenceColumn.setMinWidth(100);
        revisedConsequenceColumn.setCellValueFactory(new PropertyValueFactory<>("revisedConsequence"));
        //table
        table.setItems(getRisks());
        table.getColumns().addAll(idColumn, descriptionColumn, probabilityColumn, consequenceColumn, exposureColumn, revisedProbabilityColumn, revisedConsequenceColumn);
        return table;
    }
}
