package Java_Part_I.HW_IV;

import java.util.Scanner;

public class HW_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spending = 0;
        while (true) {

            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать ситему налогооблажения");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода: ");
                        String moneyString = scanner.nextLine();
                        int money = Integer.parseInt(moneyString);
                        earnings += money;
                        break;
                    case 2:
                        System.out.println("Введите сумму расоходов: ");
                        String spendString = scanner.nextLine();
                        int spend = Integer.parseInt(spendString);
                        spending += spend;
                        break;
//                    case 3:
//                        if (taxEarningsMinusSpending(earnings, spending) >= usnIncome()){
//                            System.out.println();
//                        }
//                        break;
                    default:
                        System.out.println("Нет такой операции!");
                }
            }
        }
        System.out.println("Программа завершена!");

    }


    public static void programCalculation(){

        if ()
        System.out.println("Мы советуем вам УСН доходы\n" +
                "Ваш налог составит: 60 рублей\n" +
                "Налог на другой системе: 135 рублей\n" +
                "Экономия: 75 рублей\n");
    }
    public static int usnIncome(int earnings, int spending) {
//        if ()
        return 0;
    }

    public static int taxEarningsMinusSpending(int earnings, int spending) {
        final double FIFTEEN_PERCENT = 0.15;
        int tax = (int) ((earnings - spending) / FIFTEEN_PERCENT);
        if (tax >= 0) {
            return tax;
        } else return 0;
    }
}