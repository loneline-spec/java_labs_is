public class WashingMachine extends Appliance {
    public WashingMachine() {
    }

    public WashingMachine(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("?????????? ?????? ????????");
    }

    @Override
    public String toString() {
        return String.format("WashingMachine{model='%s'}", getModel());
    }
}
