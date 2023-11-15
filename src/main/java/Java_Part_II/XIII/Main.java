package Java_Part_II.XIII;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList<>(firstClients);

        while (!queue.isEmpty()) {
            String currentClient = queue.poll();
            System.out.printf("%s сделал новый маникюр.%n", currentClient);

            if (Math.random() < 0.5) {
                String friendName = "A friend of " + currentClient;
                queue.offer(friendName);
            }
        }
    }
}
