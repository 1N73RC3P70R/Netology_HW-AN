package Java_Part_II.IX_I;

public class SimpleAccount extends Account {
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
        balance += amount;
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}