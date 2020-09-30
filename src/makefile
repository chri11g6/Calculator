JC		:= javac

logic	:= logic
view	:= view

default: $(logic)/Calculator.class $(logic)/Display.class $(logic)/MathMode.class $(logic)/iCalculator.class $(view)/iCalculator.class
	$(JC) App.java

$(logic)/Calculator.class:
	$(JC) -cp . $(logic)/Calculator.java

$(logic)/Display.class:
	$(JC) -cp . $(logic)/Display.java

$(logic)/MathMode.class:
	$(JC) -cp . $(logic)/MathMode.java

$(logic)/iCalculator.class:
	$(JC) -cp . $(logic)/iCalculator.java

$(view)/iCalculator.class:
	$(JC) -cp . $(view)/CalculatorController.java