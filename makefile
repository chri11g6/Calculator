JC			:= javac

modulPath	:= --module-path lib --add-modules javafx.controls

src			:= src
logic		:= $(src)/logic
view		:= $(src)/view
javaFX		:= $(view)/javaFX
fxml		:= $(view)/fxml
buttonCom	:= $(javaFX)/buttonCom

default: $(javaFX)/GUI.class
	$(JC) $(modulPath) -cp $(src) $(src)/App.java

# logic
$(logic)/Calculator.class: $(logic)/MathMode.class $(logic)/Display.class $(logic)/iCalculator.class
	$(JC) -cp $(src) $(logic)/Calculator.java

$(logic)/CalculatorFactory.class: $(logic)/iCalculator.class $(logic)/Calculator.class
	$(JC) -cp $(src) $(logic)/CalculatorFactory.java

$(logic)/Display.class:
	$(JC) -cp $(src) $(logic)/Display.java

$(logic)/MathMode.class:
	$(JC) -cp $(src) $(logic)/MathMode.java

$(logic)/iCalculator.class:
	$(JC) -cp $(src) $(logic)/iCalculator.java

# view

# javaFX
$(javaFX)/DisplayCom.class:
	$(JC) $(modulPath) -cp $(src) $(javaFX)/DisplayCom.java

$(javaFX)/GridButtonPane.class: $(buttonCom)/AddButton.class $(buttonCom)/ClearButton.class $(buttonCom)/CosButton.class $(buttonCom)/DivButton.class $(buttonCom)/EqButton.class $(buttonCom)/InputButton.class $(buttonCom)/MulButton.class $(buttonCom)/PowButton.class $(buttonCom)/SinButton.class $(buttonCom)/SqrtButton.class $(buttonCom)/SubButton.class $(buttonCom)/TanButton.class
	$(JC) $(modulPath) -cp $(src) $(javaFX)/GridButtonPane.java

$(javaFX)/GUI.class: $(logic)/CalculatorFactory.class $(logic)/iCalculator.class $(javaFX)/DisplayCom.class
	$(JC) $(modulPath) -cp $(src) $(javaFX)/GUI.java


# buttonCom
$(buttonCom)/AddButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/AddButton.java
	
$(buttonCom)/ClearButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/ClearButton.java

$(buttonCom)/CosButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/CosButton.java

$(buttonCom)/DivButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/DivButton.java

$(buttonCom)/EqButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/EqButton.java

$(buttonCom)/InputButton.class: $(javaFX)/GUI.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/InputButton.java

$(buttonCom)/MulButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/MulButton.java

$(buttonCom)/PowButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/PowButton.java

$(buttonCom)/SinButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/SinButton.java

$(buttonCom)/SqrtButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/SqrtButton.java

$(buttonCom)/SubButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/SubButton.java

$(buttonCom)/TanButton.class: $(javaFX)/GUI.class $(buttonCom)/InputButton.class
	$(JC) $(modulPath) -cp $(src) $(buttonCom)/TanButton.java

# fxml
$(fxml)/FxmlRun.class:
	$(JC) -cp $(src) $(fxml)/FxmlRun.java

$(fxml)/CalculatorController.class: $(logic)/CalculatorFactory.class
	$(JC) -cp $(src) $(fxml)/CalculatorController.java

clean:
	find -iname "*.class" -delete