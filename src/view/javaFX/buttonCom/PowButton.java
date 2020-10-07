package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class PowButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.pow();
		GUI.displayReferences.updateDisplay();
	}
}
