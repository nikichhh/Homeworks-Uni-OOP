package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Shop {
    private String name;
    private Item[] items;
    private int count;

    public Shop(String name, int capacity) {
        this.name = name;
        this.items = new Item[capacity];
        this.count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count++] = item;
        }
    }

    public int getItemCountDelivery() {
        int deliveryCount = 0;
        for (int i = 0; i < count; i++) {
            if (items[i].needsDelivery()) {
                deliveryCount++;
            }
        }
        return deliveryCount;
    }

    public double getAverageDaysToExpire() {
        int totalDays = 0;
        for (int i = 0; i < count; i++) {
            totalDays += items[i].getDaysToExpire();
        }
        return count > 0 ? (double) totalDays / count : 0;
    }

    public int getAvailableDrinksCount() {
        int drinksCount = 0;
        for (int i = 0; i < count; i++) {
            if (items[i].getItemType() == ItemType.DRINK) {
                drinksCount += items[i].getAvailableQuantity();
            }
        }
        return drinksCount;
    }

    public String toString() {
        String result = "Магазин: " + name + "\n";
        for (int i = 0; i < count; i++) {
            result += items[i].getClass().getSimpleName() + " - Налични: " + items[i].getAvailableQuantity() + "\n";
        }
        return result;
    }
}
