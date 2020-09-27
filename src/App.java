import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
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
