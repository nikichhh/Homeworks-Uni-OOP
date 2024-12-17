package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private int availableQuantity;
    private ItemType itemType;

    public Item(String name, int daysToExpire, int availableQuantity, ItemType itemType) throws InvalidDataException {
        if (name == null || name.isEmpty() || daysToExpire < 0 || availableQuantity < 0) {
            throw new InvalidDataException("Некоректни данни за артикула!");
        }
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

    public boolean needsDelivery() {
        return availableQuantity < 10;
    }
}