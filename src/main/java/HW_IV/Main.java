//package HW_IV;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while(true){
//
//            System.out.println("Программа завершена!");
//        }
//
//    }
//
//    public static void calculation(){
//        int earnings = 0;
//        int spending = 0;
//
//        int operation = Integer.parseInt(input);
//        switch (operation) {
//            case 1:
//                System.out.println("Введите сумму дохода:");
//                String moneyStr = scanner.nextLine();
//                int money = Integer.parseInt(moneyStr);
//                earnings += money;
//                break;
//            case 2:
//                // действия при выборе второй операции
//
//                break;
//            case 3:
//                // действия при выборе третьей операции
//
//                break;
//            default:
//                System.out.println("Такой операции нет");
//        }
//    }
//    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
//        int tax = (earnings - spendings) * 15 / 100;
//        if (tax >= 0) {
//            return tax;
//        } else {
//
//            return 0;
//        }
//    }
//
//}
