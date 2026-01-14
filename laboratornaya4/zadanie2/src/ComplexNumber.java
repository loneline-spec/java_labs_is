public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double magnitude() {
        return Math.hypot(real, imaginary);
    }

    public double angleRadians() {
        return Math.atan2(imaginary, real);
    }

    public String toPolarString() {
        return String.format("r=%.4f, phi=%.4f rad", magnitude(), angleRadians());
    }

    @Override
    public String toString() {
        return String.format("%.4f%+.4fi", real, imaginary);
    }
}
