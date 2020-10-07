package view.buttonCom;

import view.GUI;

public class SubButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sub();
		GUI.displayReferences.updateDisplay();
	}
}
