package view.javaFX.buttonCom;

import view.javaFX.GUI;

public class AddButton extends InputButton {
	@Override
	protected void buttonAction(String in) {
		GUI.calculator.add();
		GUI.displayReferences.updateDisplay();
	}
}
