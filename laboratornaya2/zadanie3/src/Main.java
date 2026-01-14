import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int MIN_VALUE = -9;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int target = 0;

        if (args.length >= 3) {
            rows = Integer.parseInt(args[0]);
            cols = Integer.parseInt(args[1]);
            target = Integer.parseInt(args[2]);
        }

        int[][] matrix = buildMatrix(rows, cols);
        int[] vector = buildVector(matrix, target);

        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Vector B (values != " + target + "): " + Arrays.toString(vector));
    }

    private static int[][] buildMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return matrix;
    }

    private static int[] buildVector(int[][] matrix, int target) {
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value != target) {
                    count++;
                }
            }
        }

        int[] vector = new int[count];
        int index = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value != target) {
                    vector[index++] = value;
                }
            }
        }
        return vector;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
