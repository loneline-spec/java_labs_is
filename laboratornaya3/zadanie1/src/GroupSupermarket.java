import java.util.Arrays;
import java.util.Comparator;

public class GroupSupermarket {
    private int id;
    private Supermarket[] items;

    public GroupSupermarket() {
        this(0, new Supermarket[0]);
    }

    public GroupSupermarket(int id, Supermarket[] items) {
        this.id = id;
        this.items = items == null ? new Supermarket[0] : Arrays.copyOf(items, items.length);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supermarket[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    public void setItems(Supermarket[] items) {
        this.items = items == null ? new Supermarket[0] : Arrays.copyOf(items, items.length);
    }

    public Supermarket getItem(int index) {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return items[index];
    }

    public void setItem(int index, Supermarket item) {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        items[index] = item;
    }

    public void addItem(Supermarket item) {
        Supermarket[] next = Arrays.copyOf(items, items.length + 1);
        next[items.length] = item;
        items = next;
    }

    public boolean removeByProductCode(String productCode) {
        if (productCode == null) {
            return false;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && productCode.equals(items[i].getProductCode())) {
                Supermarket[] next = new Supermarket[items.length - 1];
                System.arraycopy(items, 0, next, 0, i);
                System.arraycopy(items, i + 1, next, i, items.length - i - 1);
                items = next;
                return true;
            }
        }
        return false;
    }

    public void sortByRetailPrice() {
        Arrays.sort(items, Comparator.comparingDouble(item -> item == null ? Double.MAX_VALUE : item.getRetailPrice()));
    }
}
