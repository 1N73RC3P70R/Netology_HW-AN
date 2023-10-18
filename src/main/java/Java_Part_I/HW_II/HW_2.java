package Java_Part_I.HW_II;

import Java_Part_I.HW_II.ru.netology.service.CustomsService;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        System.out.println("Размер пошлины (в руб.) составит: " + CustomsService.calculateCustoms(price, weight));
    }
}
