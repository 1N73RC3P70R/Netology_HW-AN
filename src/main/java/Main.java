import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = newMatrix();

        System.out.println("Матрица:\n");
        print(matrix);

        System.out.println("\nПовернуть матрицу:\n1. По часовой 90 градусов\n2. Против часовой 90 градусов\n3. По часовой 180 градусов\n4. Против часовой 180 градусов\n5. По часовой 270 градусов\n6. Против часовой 270 градусов");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println();
                int[][] resultClock = rotateMatrix90(matrix);
                print(resultClock);
                break;
            case 2:
                System.out.println();
                int[][] resultCounter = rotateMatrixCounter90(matrix);
                print(resultCounter);
                break;
            case 3:
                System.out.println();
                int[][] result180 = rotateMatrix180(matrix);
                print(result180);
                break;
            case 4:
                System.out.println();
                int[][] resultCounter180 = rotateMatrixCounter180(matrix);
                print(resultCounter180);
                break;
            case 5:
                System.out.println();
                int[][] resultMatrix270 = rotateMatrix270(matrix);
                print(resultMatrix270);
                break;
            case 6:
                System.out.println();
                int[][] resultCounter270 =  rotateMatrixCounter270(matrix);
                print(resultCounter270);
                break;
            default:
                System.out.println("Нет такой опции!");
        }
    }

    //ROTATION
    private static int[][] rotateMatrix90(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrixCounter90(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[matrix.length - 1 - j][i] = matrix[j][i];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrix180(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resultMatrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrixCounter180(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resultMatrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrix270(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resultMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrixCounter270(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resultMatrix[matrix.length - 1 - j][i] = matrix[j][i];
            }
        }
        return resultMatrix;
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] newMatrix() {
        int[][] matrix = new int[Main.SIZE][Main.SIZE];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
}
