package HW_IV;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
             String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")){
            System.out.println("Всего доброго!");
            break;}

            int earnings = 0;
            int spendings = 0;

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String expenseString = scanner.nextLine();
                    int moneyAdd = Integer.parseInt(expenseString);
                    earnings += moneyAdd;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    int moneyStr;
                    break;
                case 3:
                    System.out.println("Введите сумму расхода:");

                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");



    }

}