package Java_Part_II.XI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> todoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            String input = scanner.nextLine();

            switch (Integer.parseInt(input)) {
                case 0:
                    System.out.println("До свидания!");
                    return;
                case 1:
                    addTask();
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    removeTaskByNumber();
                    break;
                case 4:
                    removeTaskByName();
                    break;
                case 5:
                    removeTasksByKeyword();
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз!");
            }
        }
    }


    static void menu() {
        System.out.println("""
                Выберите операцию:
                                    
                0. Выход из программы
                1. Добавить дело
                2. Показать дела
                3. Удалить дело по номеру
                4. Удалить дело по названию
                5. Удалить по ключевому слову
                                    
                Ваш выбор: """);
    }

    private static void addTask() {
        System.out.print("Введите название задачи: ");
        String task = scanner.nextLine();
        if (!todoList.contains(task)) {
            todoList.add(task);
            System.out.println("Добавлено!");
        } else {
            System.out.println("Такая задача уже существует.");
        }
        showTasks();
    }

    private static void showTasks() {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    private static void removeTaskByNumber() {
        showTasks();
        System.out.print("Введите номер для удаления: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber >= 1 && taskNumber <= todoList.size()) {
            todoList.remove(taskNumber - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет задачи с таким номером.");
        }
        showTasks();
    }

    private static void removeTaskByName() {
        System.out.print("Введите задачу для удаления: ");
        String task = scanner.nextLine();
        if (todoList.contains(task)) {
            todoList.remove(task);
            System.out.println("Удалено!");
        } else {
            System.out.println("Нет задачи с таким названием.");
        }
        showTasks();
    }

    private static void removeTasksByKeyword() {
        System.out.print("Введите ключевое слово для удаления задач: ");
        String keyword = scanner.nextLine();

        todoList.removeIf(task -> task.contains(keyword));

        System.out.println("Задачи с ключевым словом '" + keyword + "' удалены!");
        showTasks();
    }

}