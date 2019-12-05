package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    Logic.RiskManagerControl controller = new Logic.RiskManagerControl();
    RiskTable table = new RiskTable(this, controller.getRisks());

    @Override
    public void start(Stage stage) throws Exception {
        Stage window = stage;
        window.setTitle("Risk Manager");
        window.setResizable(false);
        VBox grpMainCurrent = new VBox();
        HBox toolbarHbox = new HBox();
        TextField deleteIDTextField = new TextField("Enter an ID");
        TextField descriptionTextField = new TextField("description");
        TextField probabilityTextField = new TextField("probability");
        TextField consequenceTextField = new TextField("consequence");
        deleteIDTextField.setPrefWidth(100);
        deleteIDTextField.setPrefWidth(100);
        deleteIDTextField.setPrefWidth(100);
        deleteIDTextField.setPrefWidth(100);
        Button addRiskButton = new Button("Add Risk");
        addRiskButton.setOnAction(actionEvent -> {
            //this adds a logic risk to the logic risk table. Then we sendRisk() with information based on our textFields.
            //then we call the ui table to get the logic risks within the logic risk table array-list and insert the into the table
            try {
                controller.addRisk();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //this line will produce an error if a string is entered in the double fields
            controller.sendRisk(controller.getRisks().get(controller.getRisks().size()-1),descriptionTextField.getText(),Double.parseDouble(probabilityTextField.getText()),Double.parseDouble(consequenceTextField.getText()));
            table.updateRiskTable();
        });
        Button deleteRiskButton = new Button("Delete Risk");
        deleteRiskButton.setOnAction(actionEvent -> {
            //table.deleteRisk(Integer.parseInt(deleteIDTextField.getText()));
            controller.deleteRisk(Integer.parseInt(deleteIDTextField.getText()));
            table.updateRiskTable();
        });
        toolbarHbox.getChildren().addAll(addRiskButton, descriptionTextField, probabilityTextField, consequenceTextField,deleteRiskButton,deleteIDTextField);
        grpMainCurrent.getChildren().addAll(toolbarHbox, table.getTable());
        window.setScene(new Scene(grpMainCurrent, 675, 250));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}