public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <a> <b>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double max = Math.max(a, b);
        double min = Math.min(a, b);

        double numerator = max - 2 * Math.sqrt(min) + 4.2 * min;
        double denominator = 1 + (max / min);
        double d = numerator / denominator;

        System.out.println(d);
    }
}
