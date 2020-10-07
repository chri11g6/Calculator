package view.ButtonCom;

import view.GUI;

public class ClearButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.reset();
		GUI.displayReferences.updateDisplay();
	}
}
