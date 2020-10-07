package view.buttonCom;

import view.GUI;

public class EqButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.eq();
		GUI.displayReferences.updateDisplay();
	}
}
