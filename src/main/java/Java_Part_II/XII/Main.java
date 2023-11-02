package Java_Part_II.XII;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        double totalCost = 0;
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueCountries = new HashSet<>();

        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Россия", "Нижний Новгород");
        Address address3 = new Address("Белоруссия", "Минск");
        Address address4 = new Address("Сербия", "Белград");
        Address address5 = new Address("Болгария", "София");

        Map<Address, Double> costPerAddress = new HashMap<>();
        costPerAddress.put(address1, 500.00);
        costPerAddress.put(address2, 650.00);
        costPerAddress.put(address3, 1000.00);
        costPerAddress.put(address4, 1500.00);
        costPerAddress.put(address5, 2000.00);


        while (true) {
            System.out.println("""
                    Заполнение нового заказа.
                    Введите страну: """);
            String country = scanner.nextLine();

            if (country.equalsIgnoreCase("end")) {
                break;
            }

            System.out.println("Город: ");
            String city = scanner.nextLine();

            System.out.println("Вес: ");
            double weight = Double.parseDouble(scanner.nextLine());

            Address userAddress = new Address(country, city);
            Double deliveryCost = costPerAddress.get(userAddress);

            if (deliveryCost != null) {
                double orderCost = deliveryCost * weight;
                totalCost += orderCost;
                uniqueCountries.add(country);
            } else {
                System.out.println("Доставки по этому адресу нет!");
            }
        }

        System.out.printf("Стоимость доставки составит: %.2f руб.\nКоличество стран: %d", totalCost, uniqueCountries.size());
    }
}