package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class CosButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.cos();
		GUI.displayReferences.updateDisplay();
	}
}
