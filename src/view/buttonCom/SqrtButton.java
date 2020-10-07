package view.buttonCom;

import view.GUI;

public class SqrtButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.sqrt();
		GUI.displayReferences.updateDisplay();
	}
}
