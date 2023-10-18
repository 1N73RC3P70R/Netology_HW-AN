package Java_Part_I.HW_I;

import java.util.Scanner;

public class HW_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Доходы: ");
        int income = scan.nextInt();
        System.out.println("Расходы: ");
        int spending = scan.nextInt();
        System.out.println("Итого руб.: " + calculateNetIncome(income, spending));
    }

    public static int calculateNetIncome(int income, int spending) {
        return income + spending;
    }
}
