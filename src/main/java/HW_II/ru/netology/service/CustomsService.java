package HW_II.ru.netology.service;

public class CustomsService {
    public static final int CALCULATE_CUSTOMS(final int price, final int weight) {
        final double taxOnPrice = 0.01;
        final int taxOnWeight = 100;

        double taxPrice = 0;
        int taxWeight = 0;

        for (int i = 0; i < price; i++) {
            taxPrice = price * taxOnPrice;
        }

        for (int i = 0; i < weight; i++) {
            taxWeight = weight * taxOnWeight;

        }
        final int result = (int) (taxPrice + taxWeight);
        return result;
    }
}
