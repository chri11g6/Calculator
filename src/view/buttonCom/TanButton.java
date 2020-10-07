package view.buttonCom;

import view.GUI;

public class TanButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.tan();
		GUI.displayReferences.updateDisplay();
	}
}
