package Java_Part_II.IX_I;

public class Main {
    public static void main(String[] args) {
        CreditAccount credit1 = new CreditAccount(Math.abs(1_000_000));
        SimpleAccount simple1 = new SimpleAccount();

        boolean addCheck = credit1.add(500_000);
        if (!addCheck) {
            System.out.println("Ошибка!");
            return;
        }

        boolean transferCheck = credit1.transfer(simple1, 100_000);
        if (!transferCheck) {
            System.out.println("Недостаточно средств!");
            return;
        }

        long balanceSimple = simple1.getBalance();
        long balanceCredit = credit1.getBalance();

        System.out.println("Кредитный аккаунт: " + balanceCredit);
        System.out.println("Простой аккаунт: " + balanceSimple);
    }
}