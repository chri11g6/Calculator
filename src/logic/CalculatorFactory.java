package logic;

public class CalculatorFactory {
    public static iCalculator getCalculator(){
        return new Calculator();
    }
}
