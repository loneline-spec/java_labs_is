import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    private static final int MIN_VALUE = -99;
    private static final int MAX_VALUE = 99;

    public static void main(String[] args) {
        int size = 10;
        if (args.length >= 1) {
            size = Integer.parseInt(args[0]);
        }

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }

        double[] reciprocal = CreateReciprocalFraction(array);
        int[] unique = getUniqueElements(array);

        System.out.println("Source: " + Arrays.toString(array));
        System.out.println("Reciprocal: " + Arrays.toString(reciprocal));
        System.out.println("Unique: " + Arrays.toString(unique));
    }

    public static double[] CreateReciprocalFraction(int[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                result[i] = 1.0 / array[i];
            } catch (ArithmeticException ex) {
                result[i] = Double.POSITIVE_INFINITY;
            }
        }
        return result;
    }

    private static int[] getUniqueElements(int[] array) {
        Set<Integer> unique = new LinkedHashSet<>();
        for (int value : array) {
            unique.add(value);
        }
        int[] result = new int[unique.size()];
        int index = 0;
        for (int value : unique) {
            result[index++] = value;
        }
        return result;
    }
}
