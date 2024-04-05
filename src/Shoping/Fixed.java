package Shoping;

public class Fixed extends Discount{
    @Override
    public int discountAmount(int total) {
        return (int) (total * 0.10);
    }
}
