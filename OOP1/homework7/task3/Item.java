package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private int availableQuantity;
    private ItemType itemType;

    public Item(String name, int daysToExpire, int availableQuantity, ItemType itemType) {
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availableQuantity = availableQuantity;
        this.itemType = itemType;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + itemType + ", Days to Expire: " + daysToExpire +
                ", Available Quantity: " + availableQuantity;
    }
}
