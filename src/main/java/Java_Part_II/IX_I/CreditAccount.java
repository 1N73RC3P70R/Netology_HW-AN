package Java_Part_II.IX_I;
public class CreditAccount extends Account {
    private long limit;

    public CreditAccount(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (balance >= amount) {
            balance -= amount;
            account.add(amount);
            return true;
        }
        return false;
    }

    public boolean add(long amount) {
        if (balance + amount <= limit) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(long amount) {
        if (balance - amount >= -limit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}