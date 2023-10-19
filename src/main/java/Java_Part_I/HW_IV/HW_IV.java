package Java_Part_I.HW_IV;

import java.util.Scanner;

public class HW_IV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spending = 0;

        while (true) {

            String menuText = """
                    Выберите операцию и введите её номер:
                     1. Добавить новый доход
                     2. Добавить новый расход
                     3. Выбрать ситему налогооблажения""";
            System.out.println(menuText);

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода: ");
                        int incomeInput = Integer.parseInt(scanner.nextLine());

                        earnings += incomeInput;
                        break;
                    case 2:
                        System.out.println("Введите сумму расоходов: ");
                        int spendInput = Integer.parseInt(scanner.nextLine());
                        spending += spendInput;
                        break;
                    case 3:
                        recommendTaxSystem(earnings, spending);
                        break;

                    default:
                        System.out.println("Нет такой операции!");
                }
            }
        }
        System.out.println("Программа завершена!");
    }


    public static void recommendTaxSystem(int earnings, int spending) {

        double taxEarnings = taxEarningsMinusSpending(earnings, spending);
        double taxUSN = usnIncome(earnings);

        if (taxEarnings > taxUSN) {

            System.out.printf("""
                    Мы советуем вам "УСН доходы"
                    Ваш налог составит: %.2f рублей
                    Налог на другой системе: %.2f рублей
                    Экономия: %.2f рублей
                    %n%n""", taxEarnings, taxUSN, (int) taxEarnings - taxUSN);

        } else if (taxEarnings < taxUSN) {

            System.out.printf("""
                    Мы советуем вам "УСН доходы"
                    Ваш налог составит: %.2f рублей
                    Налог на другой системе: %.2f рублей
                    Экономия: %.2f рублей
|                    %n%n""", usnIncome(earnings), taxEarnings, usnIncome(earnings) - taxEarnings);

        } else if (Math.abs(taxEarnings - taxUSN) < 0.0001) {
            System.out.println("Налоговая система не имеет значения.\n\n");
        }

    }

    public static double usnIncome(int earnings) {
        final double PERCENT = 0.06;
        return earnings * PERCENT;
    }

    public static int taxEarningsMinusSpending(int earnings, int spending) {
        final double FIFTEEN_PERCENT = 0.15;
        int tax = (int) ((earnings - spending) * FIFTEEN_PERCENT);
        if (tax >= 0) {
            return tax;
        } else return 0;
    }
}