package Java_Part_I.HW_VIII;

public class HW_IX {
    public static void main(String[] args) {
        Company company = new Company("Нетология", new USNIncSixPerc());
        company.shiftMoney(10000);
        company.payTaxes();

        company.setTaxSystem(new USNIncMinusExp());
        company.shiftMoney(5000);
        company.shiftMoney(-2000);
        company.payTaxes();

        Deal[] deals = {
                new Sale("Товар 1", 5000),
                new Expenditure("Товар 2", 2000),
                new Sale("Товар 3", 3000),
                new Expenditure("Товар 4", 1000)
        };
        int balanceBeforeTax = company.applyDeals(deals);
        System.out.println("Остаток до налогообложения: " + balanceBeforeTax + " руб.");
    }
}