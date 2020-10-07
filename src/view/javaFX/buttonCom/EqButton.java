package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class EqButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.eq();
		GUI.displayReferences.updateDisplay();
	}
}
