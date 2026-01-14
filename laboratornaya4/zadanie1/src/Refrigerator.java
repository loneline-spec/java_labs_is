public class Refrigerator extends Appliance {
    public Refrigerator() {
    }

    public Refrigerator(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("??????????? ???????");
    }

    @Override
    public String toString() {
        return String.format("Refrigerator{model='%s'}", getModel());
    }
}
