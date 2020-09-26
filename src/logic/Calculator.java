package logic;

public class Calculator implements iCalculator {
    private double tal = 0;
    private MathMode mode = MathMode.ADD;
    private boolean isAfterCalculate = false;

    private Display display = new Display();

    public void add(){
        calculate();
        mode = MathMode.ADD;
    }

    public void sub(){
        calculate();
        mode = MathMode.SUB;
    }

    public void gang(){
        calculate();
        mode = MathMode.MULTIPLY;
    }

    public void dividere(){
        calculate();
        mode = MathMode.DIVIDERE;
    }

    public void eq(){
        calculate();
        display.setDisplayView(String.valueOf(tal));
        mode = MathMode.NOT;
    }

    public void reset(){
        tal = 0;
        display.reset();
        mode = MathMode.ADD;
    }

    public void addInput(String data){
        if(isAfterCalculate){
            display.reset();
            isAfterCalculate = false;
        }

        display.addInput(data);
    }

    public String getDisplay() {
        return display.toString().replace(".", ",");
    }

    private void calculate(){
        double fromDisplay = display.getDouble();

        switch(mode){
            case ADD:
                tal = tal + fromDisplay;
                break;
            case SUB:
                tal = tal - fromDisplay;
                break;
            case MULTIPLY:
                tal = tal * fromDisplay;
                break;
            case DIVIDERE:
                tal = tal / fromDisplay;
                break;
            default:
                break;
        }
        isAfterCalculate = true;
    }
}
