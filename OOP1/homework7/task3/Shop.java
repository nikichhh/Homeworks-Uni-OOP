package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Shop {
    private Item[] items;
    private int count;

    public Shop(Item[] items) {
        this.items = items;
        this.count = items.length;
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
        double totalDays = 0;
        for (int i = 0; i < count; i++) {
            totalDays += items[i].getDaysToExpire();
        }
        return count > 0 ? totalDays / count : 0;
    }

    public int getAvailableDrinksCount() {
        int drinkCount = 0;
        for (int i = 0; i < count; i++) {
            if (items[i].getItemType() == ItemType.DRINK) {
                drinkCount += items[i].getAvailableQuantity();
            }
        }
        return drinkCount;
    }

    public void printItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
