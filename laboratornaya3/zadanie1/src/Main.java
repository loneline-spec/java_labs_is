public class Main {
    public static void main(String[] args) {
        Supermarket item1 = new Supermarket("Grocery", "A123", "Milk", "Belarus", 2.50, "DairyCo");
        Supermarket item2 = new Supermarket("Bakery", "B456", "Bread", "Russia", 1.20, "BakePro");
        Supermarket item3 = new Supermarket("Beverages", "C789", "Juice", "Poland", 3.10, "FruitLine");

        GroupSupermarket group = new GroupSupermarket(1, new Supermarket[] { item1, item2 });
        group.addItem(item3);
        group.sortByRetailPrice();
        group.removeByProductCode("B456");

        for (Supermarket item : group.getItems()) {
            System.out.println(item);
        }
    }
}
