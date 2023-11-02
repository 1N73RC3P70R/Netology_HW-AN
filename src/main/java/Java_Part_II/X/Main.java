package Java_Part_II.X;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordChecker checkPassword = new PasswordChecker();

        try {
            System.out.println("Введите мин. длину пароля: ");
            int minLength = Integer.parseInt(scanner.nextLine());
            checkPassword.setMinLength(minLength);
        } catch (IllegalArgumentException e) {
            System.out.println("Не подходит!");
        }

        try {
            System.out.println("Введите макс. допустимое количество повторений символа подряд: ");
            int maxRepeats = Integer.parseInt(scanner.nextLine());
            checkPassword.setMaxRepeats(maxRepeats);
        } catch (IllegalArgumentException e) {
            System.out.println("Не подходит!");
        }

        while (true) {
            System.out.println("Введите пароль или end: ");
            String input = scanner.nextLine();

            if ("end".equalsIgnoreCase(input)) {
                break;
            }

            if (checkPassword.verify(input)) {
                System.out.println("Подходит!");
            } else {
                System.out.println("Не подходит!");
            }
        }
    }
}