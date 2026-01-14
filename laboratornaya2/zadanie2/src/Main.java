import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int MIN_VALUE = -99;
    private static final int MAX_VALUE = 99;

    public static void main(String[] args) {
        int[] b = buildSourceArray(args);
        int[] c = extractNegatives(b);
        selectionSort(c);

        System.out.println("B: " + Arrays.toString(b));
        System.out.println("C (sorted negatives): " + Arrays.toString(c));
    }

    private static int[] buildSourceArray(String[] args) {
        if (args.length > 1) {
            int[] b = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                b[i] = Integer.parseInt(args[i]);
            }
            return b;
        }

        int size = 10;
        if (args.length == 1) {
            size = Integer.parseInt(args[0]);
        }

        int[] b = new int[size];
        Random random = new Random();
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
        return b;
    }

    private static int[] extractNegatives(int[] b) {
        int count = 0;
        for (int value : b) {
            if (value < 0) {
                count++;
            }
        }

        int[] c = new int[count];
        int index = 0;
        for (int value : b) {
            if (value < 0) {
                c[index++] = value;
            }
        }
        return c;
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }
}
