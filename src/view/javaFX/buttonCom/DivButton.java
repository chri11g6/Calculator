package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class DivButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.dividere();
		GUI.displayReferences.updateDisplay();
	}
}
