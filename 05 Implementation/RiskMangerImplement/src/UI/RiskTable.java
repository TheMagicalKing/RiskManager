package UI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RiskTable {
    TableView<Risk> table;
    ObservableList<Risk> risks = FXCollections.observableArrayList();

    public void deleteRisk(int id){
        for (Risk risk : risks){
            if (risk.getId()==id){
                System.out.println("we got a risk with the id:"+id);
                risks.remove(risk);
                break;
            }
            System.out.println("we did not find a risk with the id:"+id);
        }
        table.setItems(getRisks());
    }

    public void addRisk(int id, String description, int probability, int consequence, int revisedProbability, int revisedConsequence){
        //for some reason this line also deletes all elements in risks list
        //table.getItems().clear();
        risks.add(new Risk(id, description, probability, consequence, revisedProbability, revisedConsequence));
        table.setItems(getRisks());
    }

    public ObservableList<Risk> getRisks(){
        return risks;
    }

    public TableView<Risk> getTable(){
        table = new TableView<>();
        //id column
        TableColumn<Risk,Integer> idColumn = new TableColumn<>("Id");
        idColumn.setMinWidth(25);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        //description column
        TableColumn<Risk,String> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setMinWidth(100);
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        //probability column
        TableColumn<Risk,Integer> probabilityColumn = new TableColumn<>("Probability");
        probabilityColumn.setMinWidth(100);
        probabilityColumn.setCellValueFactory(new PropertyValueFactory<>("probability"));
        //consequence column
        TableColumn<Risk,Integer> consequenceColumn = new TableColumn<>("Consequence");
        consequenceColumn.setMinWidth(100);
        consequenceColumn.setCellValueFactory(new PropertyValueFactory<>("consequence"));
        //exposure column
        TableColumn<Risk,Integer> exposureColumn = new TableColumn<>("Exposure");
        exposureColumn.setMinWidth(100);
        exposureColumn.setCellValueFactory(new PropertyValueFactory<>("exposure"));
        //revisedProbability column
        TableColumn<Risk,Integer> revisedProbabilityColumn = new TableColumn<>("RevisedProbability");
        revisedProbabilityColumn.setMinWidth(100);
        revisedProbabilityColumn.setCellValueFactory(new PropertyValueFactory<>("revisedProbability"));
        //revisedConsequence column
        TableColumn<Risk,Integer> revisedConsequenceColumn = new TableColumn<>("RevisedConsequence");
        revisedConsequenceColumn.setMinWidth(100);
        revisedConsequenceColumn.setCellValueFactory(new PropertyValueFactory<>("revisedConsequence"));
        //table
        table.setItems(getRisks());
        table.getColumns().addAll(idColumn, descriptionColumn, probabilityColumn, consequenceColumn, exposureColumn, revisedProbabilityColumn, revisedConsequenceColumn);
        return table;
    }
}
