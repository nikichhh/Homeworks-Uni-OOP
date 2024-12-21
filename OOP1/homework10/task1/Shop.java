package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public class Shop {
    private Item[] items;
    private int itemCount;

    public Shop(int capacity) {
        this.items = new Item[capacity];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        }
    }

    public int countItemsForDelivery() {
        int count = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].needsDelivery()) {
                count++;
            }
        }
        return count;
    }

    public double calculateItemsPrice() {
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getItemPrice() * items[i].getAvailableQuantity();
        }
        return totalPrice;
    }

    public Item getItemWithMostAvailableQuantity() {
        if (itemCount == 0) return null;
        Item maxItem = items[0];
        for (int i = 1; i < itemCount; i++) {
            if (items[i].getAvailableQuantity() > maxItem.getAvailableQuantity()) {
                maxItem = items[i];
            }
        }
        return maxItem;
    }

    public ItemType getItemTypeWithLeastQuantity() {
        int[] quantities = new int[ItemType.values().length];
        for (int i = 0; i < itemCount; i++) {
            quantities[items[i].getItemType().ordinal()] += items[i].getAvailableQuantity();
        }

        int minIndex = 0;
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < quantities[minIndex]) {
                minIndex = i;
            }
        }

        return ItemType.values()[minIndex];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itemCount; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
