package Java_Part_I.HW_IV;

import java.util.Scanner;

public class HW_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            System.out.println();

            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Всего доброго!");
                break;
            }

            int earnings = 0;
            int spending = 0;

            int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyInputAdd = scanner.nextLine();
                    int moneyAdd = Integer.parseInt(moneyInputAdd);
                    earnings += moneyAdd;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String moneyInputSpend = scanner.nextLine();
                    int moneySpend = Integer.parseInt(moneyInputSpend);
                    spending += moneySpend;
                    break;
                case 3:
                    //TODO
                    if (taxEarningsMinusSpending(earnings,spending) > sixPercent(earnings)){
                        System.out.println("Мы советуем вам УСН доходы - расходов\n" +
                                "Ваш налог составит: " + taxEarningsMinusSpending(earnings, spending));
                    } else {System.out.println("Мы советуем вам УСН доходы\n" +
                            "Ваш налог составит: ");
                        sixPercent(earnings);
                        System.out.println("Налог на другой системе: " + taxEarningsMinusSpending(earnings, spending));
                        System.out.println("Экономия: " + (taxEarningsMinusSpending(earnings, spending)));
                        break;

                    }

                    break;
                default:
                    System.out.println("Операция не существует!");
            }
        }

    }
    public static double taxEarningsMinusSpending(int earnings, int spending){
        int tax = (earnings - spending) * 15/100;
        if (tax > 0){
            return tax;
        } else {return 0;}
    }
    public static double sixPercent(int earnings){

    double tax = earnings *0.06;
return tax;
    }
}