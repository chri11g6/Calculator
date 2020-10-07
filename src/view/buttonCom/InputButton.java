package view.buttonCom;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import view.GUI;

public class InputButton {
	private Button button;
	private final double height = Double.MAX_VALUE;
	private final double width = Double.MAX_VALUE;

	public Button load(String text){
		Font fontButton = Font.font("Stencil", FontWeight.NORMAL, 20);
		button = new Button(text);
		button.setMaxSize(width, height);
		button.setFont(fontButton);
		button.setOnAction(e -> buttonAction(text));

		return button;
	}

	protected void buttonAction(String in) {
		GUI.calculator.addInput(in);
		GUI.displayReferences.updateDisplay();
	}
}
