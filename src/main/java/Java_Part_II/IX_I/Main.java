package Java_Part_II.IX_I;

public class Main {
    public static void main(String[] args) {
        CreditAccount credit1 = new CreditAccount(Math.abs(1_000_000));
        SimpleAccount simple1 = new SimpleAccount();
        long balanceSimple = simple1.getBalance();
        long balanceCredit = credit1.getBalance();

        credit1.add(500_000);
        credit1.transfer(simple1, 100_000);

        balanceSimple = simple1.getBalance();
        balanceCredit = credit1.getBalance();

        System.out.println("Кредитный аккаунт: " + balanceCredit);
        System.out.println("Простой аккаунт: " + balanceSimple);
    }
}