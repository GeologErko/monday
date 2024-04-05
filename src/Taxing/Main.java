package Taxing;

public class Main {
    public static void main(String[] args) {
        Tax simplified = new Simplified(); // 3%
        Tax common = new Common(); // 10%
        Tax patent = new Patent(); // 1%

        Company runtime = new Company("Runtime", 2_400_000, new Tax[]{simplified});
        Company arta = new Company("Arta", 90_000_000, new Tax[]{common});
        Company john = new Company("John", 7_500_000, new Tax[]{patent});
        Company fad = new Company("Fad", 100, new Tax[]{simplified, common, patent});   // для себя

        Company[] companies = new Company[]{runtime, arta, john, fad};

        for (Company company : companies) {
            int taxSize = 0;
            taxSize= company.getTotal() - company.getAmountAfterTax();
            System.out.println(company.getName());
            System.out.println("- Сумма после вычета ИПН: " + company.getAmountAfterTax());
            System.out.println("- Размер ИПН: " + taxSize);
        }
    }
}
/*
В данной постановке предоставляется код main() методы, ваша задача в том чтобы расписать классы,
мы видим компании и 3 типа налога которые к ним можно применить: Simplified, Common и Patent,
каждый тип налога должен удерживать свой процент от прибыли компании
 System.out.println("- Размер ИПН: " + company.getTaxAmount());
     */