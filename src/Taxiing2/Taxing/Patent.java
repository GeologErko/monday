package Taxiing2.Taxing;

public class Patent extends Tax {
    public int getTaxAmount (int total) {
        return (int) (total * 0.01);
    }
}