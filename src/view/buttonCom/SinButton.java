package view.buttonCom;

import view.GUI;

public class SinButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sin();
		GUI.displayReferences.updateDisplay();
	}
}
