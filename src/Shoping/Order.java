package Shoping;

public class Order {
    private final int total;
    private final Discount[] discounts;

    public int getTotal() {
        return total;
    }

    public Discount[] getDiscounts() {
        return discounts;
    }

    public Order(int total, Discount[] discounts) {
        this.total = total;
        this.discounts = discounts;
    }

    public int getDiscountAmountWithTotal () {
        int amount = 0;
        for (Discount discount : discounts) {

            amount = amount + discount.discountAmount(total);
        }
        return amount;
    }
}
