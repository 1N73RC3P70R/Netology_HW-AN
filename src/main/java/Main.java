import java.util.Random;

public class Main {
    public static final int SIZE;
    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

    }
}
