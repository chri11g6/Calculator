package view.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlRun extends Application{
	public static void run(){
        launch("");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/Calculator.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 330, 285));

        primaryStage.setMaxHeight(325);
        primaryStage.setMaxWidth(345);
        primaryStage.setMinHeight(325);
        primaryStage.setMinWidth(345);

        primaryStage.show();
    }
}
