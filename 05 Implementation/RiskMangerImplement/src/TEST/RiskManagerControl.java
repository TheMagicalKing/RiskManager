package TEST;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RiskManagerControl extends Application {

    /*private TEST.RiskTable rt = new TEST.RiskTable();

    public void addRisk(TEST.RiskTable rT){
        if(rt==null){
            System.out.println("No TEST.Risk Table Found!");
        }else{
            rt.addRisk();
        }

    }
    public void sendRisk(TEST.Risk risk, String description,double probability,double consequence){

        rt.sendRisk(risk,description,probability,consequence);

    }

     */

    @Override
    public void start(Stage stage) throws Exception {
        Stage window = stage;
        window.setTitle("Maze Man");
        window.setResizable(false);
        Group grpMainCurrent = new Group();
        Label label = new Label("xd");
        grpMainCurrent.getChildren().add(label);
        window.setScene(new Scene(grpMainCurrent, 500, 250));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
