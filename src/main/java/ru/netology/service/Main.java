package ru.netology.service;

import java.util.Scanner;

import static ru.netology.service.CustomsService.CALCULATE_CUSTOMS;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price, weight;

        System.out.print("Введите цену товара (в руб.): ");
        price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        weight = scanner.nextInt();


        System.out.println("Размер пошлины (в руб.) составит: " + CALCULATE_CUSTOMS(price, weight));
    }
}
