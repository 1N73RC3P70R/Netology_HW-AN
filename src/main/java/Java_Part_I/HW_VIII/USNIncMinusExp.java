package Java_Part_I.HW_VIII;

public class USNIncMinusExp extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int diff = debit - credit;
        return diff > 0 ? (int) (diff * 0.15) : 0;
    }
}