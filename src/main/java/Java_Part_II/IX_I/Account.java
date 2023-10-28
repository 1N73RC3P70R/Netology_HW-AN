package Java_Part_II.IX_I;

public abstract class Account {
    protected long balance;

    public long getBalance() {
        return balance;
    }

    public abstract boolean transfer(Account account, long amount);

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);
}