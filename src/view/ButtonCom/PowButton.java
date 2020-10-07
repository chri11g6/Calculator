package view.ButtonCom;

import view.GUI;

public class PowButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.pow();
		GUI.displayReferences.updateDisplay();
	}
}
