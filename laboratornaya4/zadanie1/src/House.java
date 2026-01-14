import java.util.Arrays;

public class House {
    private Appliance[] appliances;

    public House() {
        this.appliances = new Appliance[0];
    }

    public House(Appliance[] appliances) {
        setAppliances(appliances);
    }

    public Appliance[] getAppliances() {
        return Arrays.copyOf(appliances, appliances.length);
    }

    public void setAppliances(Appliance[] appliances) {
        this.appliances = appliances == null ? new Appliance[0] : Arrays.copyOf(appliances, appliances.length);
    }

    public void addAppliance(Appliance appliance) {
        Appliance[] next = Arrays.copyOf(appliances, appliances.length + 1);
        next[appliances.length] = appliance;
        appliances = next;
    }

    public Appliance popAppliance(int index) {
        if (index < 0 || index >= appliances.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Appliance removed = appliances[index];
        Appliance[] next = new Appliance[appliances.length - 1];
        System.arraycopy(appliances, 0, next, 0, index);
        System.arraycopy(appliances, index + 1, next, index, appliances.length - index - 1);
        appliances = next;
        return removed;
    }

    public int countWashingMachines() {
        return countByType(WashingMachine.class);
    }

    public int countRefrigerators() {
        return countByType(Refrigerator.class);
    }

    public int countOvens() {
        return countByType(Oven.class);
    }

    private int countByType(Class<?> type) {
        int count = 0;
        for (Appliance appliance : appliances) {
            if (type.isInstance(appliance)) {
                count++;
            }
        }
        return count;
    }

    public void turnOnAll() {
        for (Appliance appliance : appliances) {
            if (appliance != null) {
                appliance.turnOn();
            }
        }
    }

    @Override
    public String toString() {
        return "House" + Arrays.toString(appliances);
    }
}
