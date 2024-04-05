package Taxing;
public class Simplified extends Tax{
    public int getTaxAmount(int total) {
        return (int) (total * 0.03);
    }
}