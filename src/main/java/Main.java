import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] colors = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

    }
}
