package view.buttonCom;

import view.GUI;

public class CosButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.cos();
		GUI.displayReferences.updateDisplay();
	}
}
