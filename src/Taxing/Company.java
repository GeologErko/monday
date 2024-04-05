package Taxing;
public class Company {
    private final String name;
    private final int total;
    private final Tax[]taxes;
    public Company(String name, int total, Tax[] taxes) {
        this.name = name;
        this.total = total;
        this.taxes = taxes;
    }
    public int getAmountAfterTax () {
        int getTax = 0;
        for (Tax tax : taxes) {
            getTax = getTax + tax.getTaxAmount(total);
        }
        return total - getTax;
    }


    public String getName() {
        return name;
    }
    public int getTotal() {
        return total;
    }
    public Tax[] getTaxes() {
        return taxes;
    }
}