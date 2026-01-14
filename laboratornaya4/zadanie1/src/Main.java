public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.addAppliance(new WashingMachine("WM-1000"));
        house.addAppliance(new Refrigerator("RF-2000"));
        house.addAppliance(new Oven("OV-3000"));

        System.out.println("Washing machines: " + house.countWashingMachines());
        System.out.println("Refrigerators: " + house.countRefrigerators());
        System.out.println("Ovens: " + house.countOvens());

        house.turnOnAll();
    }
}
