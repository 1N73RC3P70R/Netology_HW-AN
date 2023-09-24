package HW_II.ru.netology.service;

public class CustomsService {
    static final double TAX_ON_PRICE = 0.01;
    static final int TAX_ON_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {

        double taxPrice = price * TAX_ON_PRICE;
        int taxWeight = weight * TAX_ON_WEIGHT;

        int result = (int) (taxPrice + taxWeight);
        return result;
    }
}
