package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public abstract class Item implements Delivery {
    private ItemType itemType;
    private double itemPrice;
    private int availableQuantity;

    public Item(ItemType itemType, double itemPrice, int availableQuantity) {
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean needsDelivery() {
        return availableQuantity < 10;
    }

    @Override
    public String toString() {
        return String.format("Type: %s, Price: %.2f, Available: %d", itemType, itemPrice, availableQuantity);
    }
}
