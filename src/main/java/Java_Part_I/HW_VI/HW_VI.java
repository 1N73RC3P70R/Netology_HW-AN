package Java_Part_I.HW_VI;

import java.util.Scanner;

public class HW_VI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Коробка яиц", "Сыр", "Брынза"};
        int[] prices = {80, 160, 270};

        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " - " + prices[i] + " руб.");
        }

        int[] productChosen = new int[products.length];
        int[] priceChosen = new int[prices.length];
        int sumProducts = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);

            productChosen[productNumber - 1] += productCount;
            priceChosen[productNumber - 1] += prices[productNumber - 1];

            int currentPrice = prices[productNumber - 1];

            sumProducts += currentPrice * productCount;

        }
        System.out.println("Ваша корзина:");

        for (int i = 0; i < products.length; i++) {
            int quantity = productChosen[i];
            if (quantity > 0) {
                int cost = prices[i] * quantity;
                System.out.println(products[i] + " - " + quantity + " шт.; " + prices[i] + " руб.; " + "Сумма: " + cost + " руб.");
            }
        }
        System.out.println();
        System.out.println("Итого: " + sumProducts + " руб.");
    }
}