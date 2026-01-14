public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 0);
        point.rotate(Math.PI / 2);
        System.out.println("Point: " + point);

        Point3D point3d = new Point3D(1, 1, 1);
        point3d.rotate(Math.PI / 4, Math.PI / 6, Math.PI / 3);
        System.out.println("Point3D: " + point3d);
    }
}
