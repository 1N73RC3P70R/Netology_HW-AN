package taxes;

public class USNIncSixPerc extends taxes.TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}