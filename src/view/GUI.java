package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import logic.iCalculator;
import logic.CalculatorFactory;

public class GUI extends Application{
	public static iCalculator calculator = CalculatorFactory.getCalculator();
	private DisplayCom display = new DisplayCom();
	public static DisplayCom displayReferences;

	public static void run(){
		launch("");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Calculator");

		GridPane gridPane = new GridPane();

		displayReferences = display;

		gridPane.add(display.load(), 0, 0);
		gridPane.add(new GridButtonPane().load(), 0, 1);

		Scene scene = new Scene(gridPane, 300, 275);
		primaryStage.setMinWidth(350);
		primaryStage.setMinHeight(300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
