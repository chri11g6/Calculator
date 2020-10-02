JC		:= javac

logic	:= logic
view	:= view

default: $(view)/CalculatorController.class
	$(JC) App.java

$(logic)/Calculator.class: $(logic)/MathMode.class $(logic)/Display.class
	$(JC) -cp . $(logic)/Calculator.java

$(logic)/CalculatorFactory.class: $(logic)/iCalculator.class $(logic)/Calculator.class
	$(JC) -cp . $(logic)/CalculatorFactory.java

$(logic)/Display.class:
	$(JC) -cp . $(logic)/Display.java

$(logic)/MathMode.class:
	$(JC) -cp . $(logic)/MathMode.java

$(logic)/iCalculator.class:
	$(JC) -cp . $(logic)/iCalculator.java

$(view)/CalculatorController.class: $(logic)/CalculatorFactory.class
	$(JC) -cp . $(view)/CalculatorController.java