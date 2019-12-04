package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    RiskTable table = new RiskTable();
    int countOfCancers = 1;
    private void addCountOfCancers(){
        countOfCancers++;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Stage window = stage;
        window.setTitle("Risk Manager");
        window.setResizable(false);
        VBox grpMainCurrent = new VBox();
        HBox toolbarHbox = new HBox();
        TextField deleteIDtextField = new TextField();
        deleteIDtextField.setPrefWidth(25);
        Button addRiskButton = new Button("Add Risk");
        addRiskButton.setOnAction(actionEvent -> {
            //TODO this should send the information to logic -> riskManagerController and then tell the UI table to get the risk from the logic table array-list<Risk>
            table.addRisk(countOfCancers, "cancer", 100, 420, 25, 20);
            addCountOfCancers();
        });
        Button deleteRiskButton = new Button("Delete Risk");
        deleteRiskButton.setOnAction(actionEvent -> {
            table.deleteRisk(Integer.parseInt(deleteIDtextField.getText()));
        });
        toolbarHbox.getChildren().addAll(addRiskButton,deleteRiskButton,deleteIDtextField);
        grpMainCurrent.getChildren().addAll(toolbarHbox, table.getTable());
        window.setScene(new Scene(grpMainCurrent, 675, 250));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

