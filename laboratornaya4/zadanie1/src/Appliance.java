public class Appliance {
    private String model;

    public Appliance() {
    }

    public Appliance(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn() {
        System.out.println("?????? ???????");
    }

    @Override
    public String toString() {
        return String.format("Appliance{model='%s'}", model);
    }
}
