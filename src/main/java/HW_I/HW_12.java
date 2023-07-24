package HW_I;

import java.util.Scanner;

public class HW_12 {
    public static void main(String[] args) {
        int income, spending;
        Scanner scan = new Scanner(System.in);
        System.out.println("Доходы: ");
        income = scan.nextInt();
        System.out.println("Расходы: ");
        spending = scan.nextInt();
        System.out.println("Итого руб.: " + calc(income, spending));
    }
    public static int calc(int income, int spending) {
        int result = income - spending;
        return result;
    }
}
