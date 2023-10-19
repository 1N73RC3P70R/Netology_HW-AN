package Java_Part_I.HW_VIII;

public class USNIncSixPerc extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}