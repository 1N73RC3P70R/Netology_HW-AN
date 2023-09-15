package HW_II.ru.netology.service;

public class CustomsService {
    public static int calculateCustoms(int price, int weight) {
        final double TAX_ON_PRICE = 0.01;
        final int TAX_ON_WEIGHT = 100;

        double taxPrice = 0;
        int taxWeight = 0;

        taxPrice = price * TAX_ON_PRICE;

        taxWeight = weight * TAX_ON_WEIGHT;
        int result = (int) (taxPrice + taxWeight);
        return result;
    }
}
