package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class SinButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sin();
		GUI.displayReferences.updateDisplay();
	}
}
