package view;

import javafx.scene.control.Label;
import logic.Calculator;
import logic.iCalculator;

public class CalculatorController {

    private iCalculator calculator = new Calculator();

    public Label labelDisplay;

    public void buttonClick0(){
        calculator.addInput("0");
        updataDisplay();
    }

    public void buttonClick1(){
        calculator.addInput("1");
        updataDisplay();
    }

    public void buttonClick2(){
        calculator.addInput("2");
        updataDisplay();
    }

    public void buttonClick3(){
        calculator.addInput("3");
        updataDisplay();
    }

    public void buttonClick4(){
        calculator.addInput("4");
        updataDisplay();
    }

    public void buttonClick5(){
        calculator.addInput("5");
        updataDisplay();
    }

    public void buttonClick6(){
        calculator.addInput("6");
        updataDisplay();
    }
    
    public void buttonClick7(){
        calculator.addInput("7");
        updataDisplay();
    }

    public void buttonClick8(){
        calculator.addInput("8");
        updataDisplay();
    }

    public void buttonClick9(){
        calculator.addInput("9");
        updataDisplay();
    }

    public void buttonClickKoma(){
        calculator.addInput(",");
        updataDisplay();
    }

    public void buttonClickMinus(){
        calculator.sub();
        updataDisplay();
    }

    public void buttonClickPlus(){
        calculator.add();
        updataDisplay();
    }

    public void buttonClickDividere(){
        calculator.dividere();
        updataDisplay();
    }

    public void buttonClickGange(){
        calculator.gang();
        updataDisplay();
    }

    public void buttonClickCE(){
        calculator.reset();
        updataDisplay();
    }

    public void buttonClickEq(){
        calculator.eq();
        updataDisplay();
    }

    private void updataDisplay() {
        labelDisplay.setText(calculator.getDisplay());
    }
}
