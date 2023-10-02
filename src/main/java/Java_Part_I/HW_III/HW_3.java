package Java_Part_I.HW_III;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int points = 0;

        while (true) {
            System.out.println("Введите год в формате  \"YYYY\": ");
             int year = scanner.nextInt();

            System.out.println("Введите количество дней в формате DDD: ");
             int date = scanner.nextInt();
             int correctAnswer = HW_3.Calculation(year);

            if (date != correctAnswer) {
                System.out.println("Неправильный ответ! " + "Верный ответ - " + correctAnswer + ".");
                System.out.println("Ваш счёт: " + points + "!");
                break;
            }
            points++;
        }
    }

    public static int Calculation( int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}