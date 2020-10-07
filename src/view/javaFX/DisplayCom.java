package view.javaFX;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class DisplayCom {
	private Label display = new Label();
	public Label load(){
		display.setFont(Font.font("Stencil", FontWeight.NORMAL, 48));
		display.setText("0");

		return display;
	}

	public void updateDisplay(){
		display.setText(GUI.calculator.getDisplay());
	}
}
