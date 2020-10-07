package view.ButtonCom;

import view.GUI;

public class MulButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.gang();
		GUI.displayReferences.updateDisplay();
	}
}
