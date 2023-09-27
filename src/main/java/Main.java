public class Main {
    private static int[][] rotateMatrix180(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[matrix.length - 1 - i][matrix[i].length - 1 - j] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrix270(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return resultMatrix;
    }

    private static int[][] rotateMatrixCounter270(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[i][j] = matrix[j][matrix[i].length - i - 1];
            }
        }
        return resultMatrix;
    }
}