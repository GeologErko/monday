package Shoping;

public class Main {
    public static void main(String[] args) {

        Discount fixed = new Fixed();
        Discount special = new Special();
        Discount extra = new Extra();

        Order o1 = new Order(100_000, new Discount[] {fixed});
        Order o2 = new Order(1_000_000, new Discount[]{special});
        Order o3 = new Order(10_000_000, new Discount[]{extra});


        Order [] orders = new Order[]{o1, o2, o3};
        for (Order order : orders) {
            System.out.println(order.getDiscountAmountWithTotal());
        }

    }
}
