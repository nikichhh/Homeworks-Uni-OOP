package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public class Bread extends Item {
    private String name;

    public Bread(double itemPrice, int availableQuantity, String name) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + ", Name: " + name;
    }
}
