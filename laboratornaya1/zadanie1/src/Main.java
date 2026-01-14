public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <a> <b>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double result;

        if (a * b > 100) {
            result = 3 * Math.tan(b);
        } else {
            result = a * 5;
        }

        System.out.println(result);
    }
}
