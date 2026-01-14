public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void rotate(double angleX, double angleY, double angleZ) {
        rotateX(angleX);
        rotateY(angleY);
        rotateZ(angleZ);
    }

    public void rotateX(double angleRadians) {
        double cos = Math.cos(angleRadians);
        double sin = Math.sin(angleRadians);
        double newY = y * cos - z * sin;
        double newZ = y * sin + z * cos;
        y = newY;
        z = newZ;
    }

    public void rotateY(double angleRadians) {
        double cos = Math.cos(angleRadians);
        double sin = Math.sin(angleRadians);
        double newX = x * cos + z * sin;
        double newZ = -x * sin + z * cos;
        x = newX;
        z = newZ;
    }

    public void rotateZ(double angleRadians) {
        double cos = Math.cos(angleRadians);
        double sin = Math.sin(angleRadians);
        double newX = x * cos - y * sin;
        double newY = x * sin + y * cos;
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return String.format("(%.4f, %.4f, %.4f)", x, y, z);
    }
}
