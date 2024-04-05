package Taxiing2.Taxing;

public class Common extends Tax {
    @Override
    public int getTaxAmount(int total) {
        return (int) (total * 0.10);
    }
}