public class Main {
    public static void main(String[] args) {
        double real = 3;
        double imag = 4;
        if (args.length >= 2) {
            real = Double.parseDouble(args[0]);
            imag = Double.parseDouble(args[1]);
        }

        ComplexNumber complex = new ComplexNumber(real, imag);
        System.out.println("Algebraic: " + complex);
        System.out.println("Polar: " + complex.toPolarString());
    }
}
