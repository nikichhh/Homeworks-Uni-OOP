package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public class Shop {
    private Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    public int getItemCountDelivery() {
        int count = 0;
        for (Item item : items) {
            if (item.needsDelivery()) {
                count++;
            }
        }
        return count;
    }

    public double getAverageDaysToExpire() {
        if (items.length == 0) {
            return 0;
        }
        int totalDays = 0;
        for (Item item : items) {
            totalDays += item.getDaysToExpire();
        }
        return (double) totalDays / items.length;
    }

    public int getAvailableDrinksCount() {
        int count = 0;
        for (Item item : items) {
            if (item instanceof Drink) {
                count += item.getAvailableQuantity();
            }
        }
        return count;
    }
}
