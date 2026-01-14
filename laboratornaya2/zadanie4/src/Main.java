import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int MIN_VALUE = -9;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 4;
        if (args.length >= 1) {
            n = Integer.parseInt(args[0]);
        }

        int[][] matrix = buildMatrix(n);
        System.out.println("Matrix:");
        printMatrix(matrix);

        double average = averagePositiveOnSuperDiagonal(matrix);
        if (Double.isNaN(average)) {
            System.out.println("No positive elements on superdiagonal");
        } else {
            System.out.println("Average of positives on superdiagonal: " + average);
        }
    }

    private static int[][] buildMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return matrix;
    }

    private static double averagePositiveOnSuperDiagonal(int[][] matrix) {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            int value = matrix[i][i + 1];
            if (value > 0) {
                sum += value;
                count++;
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return (double) sum / count;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
