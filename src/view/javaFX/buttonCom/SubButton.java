package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class SubButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sub();
		GUI.displayReferences.updateDisplay();
	}
}
