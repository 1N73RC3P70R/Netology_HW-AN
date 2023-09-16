package HW_II;

import java.util.Scanner;

import static HW_II.ru.netology.service.CustomsService.calculateCustoms;

public class HW_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price, weight;

        System.out.print("Введите цену товара (в руб.): ");
        price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        weight = scanner.nextInt();

        System.out.println("Размер пошлины (в руб.) составит: " + calculateCustoms(price, weight));
    }
}
