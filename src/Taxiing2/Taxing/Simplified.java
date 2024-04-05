package Taxiing2.Taxing;

public class Simplified extends Tax {
    public int getTaxAmount(int total) {
        int persentageRate = 3;
        return (int) (persentageRate*100/total);
    }
}