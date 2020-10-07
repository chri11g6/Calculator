package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class SqrtButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sqrt();
		GUI.displayReferences.updateDisplay();
	}
}
