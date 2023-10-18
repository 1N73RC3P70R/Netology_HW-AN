package taxes;

public class USNIncMinusExp extends taxes.TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int diff = debit - credit;
        return diff > 0 ? (int) (diff * 0.15) : 0;
    }
}