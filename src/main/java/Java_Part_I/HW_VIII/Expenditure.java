package Java_Part_I.HW_VIII;

public class Expenditure extends Deal {
    public Expenditure(String productName, int price) {
        super("Покупка " + productName + " на " + price + " руб", 0, price);
    }
}