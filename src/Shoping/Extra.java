package Shoping;

public class Extra extends Discount{
    public int discountAmount (int total) {
        if (total>300_000) {
            return (int) (total * 0.20);
        }
        return 0;
    }
}
