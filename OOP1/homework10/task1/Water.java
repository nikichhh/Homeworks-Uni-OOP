package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public class Water extends Item {
    private String name;
    private String waterType;

    public Water(double itemPrice, int availableQuantity, String name, String waterType) {
        super(ItemType.DRINKS, itemPrice, availableQuantity);
        this.name = name;
        this.waterType = waterType;
    }

    public String getName() {
        return name;
    }

    public String getWaterType() {
        return waterType;
    }

    @Override
    public boolean needsDelivery() {
        return (getAvailableQuantity() < 15) || ("SODA".equalsIgnoreCase(waterType) && getAvailableQuantity() < 30);
    }

    @Override
    public String toString() {
        return super.toString() + ", Name: " + name + ", Water Type: " + waterType;
    }
}
