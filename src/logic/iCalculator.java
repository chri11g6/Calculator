package logic;

public interface iCalculator {
    public void add();
    public void sub();
    public void gang();
    public void dividere();
    public void cos();
    public void sin();
    public void tan();
    public void pow();
    public void sqrt();
    public void eq();
    public void reset();
    /**
     * Button value input
     * @param data Button value
     */
    public void addInput(String data);
    /**
     * Get display view
     * @return Get from memory
     */
    public String getDisplay();
}
