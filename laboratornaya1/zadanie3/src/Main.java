public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <x>");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y;
        double f;

        if (x <= -3) {
            y = Math.pow(x, 3) + 1;
            f = Math.exp(Math.sin(x));
        } else if (x <= 4) {
            y = x * (1 + 2 * x);
            f = Math.pow(x, 4);
        } else {
            y = Math.tan(x);
            f = Math.pow(Math.tan(x), 1.0 / 5.0);
        }

        System.out.println("Y=" + y);
        System.out.println("F=" + f);
    }
}
