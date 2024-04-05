package Shoping;

public class Special extends Discount{

    public int discountAmount (int total) {
        if (total > 250_000) {
            return (int) (total * 0.15);
        }
        return 0;
    }
}
