public class Oven extends Appliance {
    public Oven() {
    }

    public Oven(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("??????? ????????");
    }

    @Override
    public String toString() {
        return String.format("Oven{model='%s'}", getModel());
    }
}
