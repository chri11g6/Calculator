package logic;

public class Display {
    private StringBuilder displayView = new StringBuilder();
    private boolean isKomaUse = false;

    protected void setDisplayView(String data){
        clear();
        displayView.append(data);
    }

    public void addInput(String data){
        if(data.equalsIgnoreCase(",") && isKomaUse){
            return;
        }
        
        if (data.equalsIgnoreCase(",")) {
            isKomaUse = true;
            if(displayView.length() == 0){
                displayView.append("0,");
                return;
            }
        }

        if(displayView.toString().equalsIgnoreCase("0")){
            clear();
        }
        
        displayView.append(data);
    }

    public void reset(){
        clear();
        displayView.append("0");
    }

    private void clear(){
        displayView.setLength(0);
        isKomaUse = false;
    }

    public double getDouble(){
        String data = displayView.toString().replace(",", ".");
        return Double.parseDouble(data);
    }

    @Override
    public String toString(){
        return displayView.toString();
    }
}
