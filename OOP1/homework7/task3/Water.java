package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Water extends Item {
    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, double mineralContent) {
        super(name, daysToExpire, availableQuantity, ItemType.DRINK);
        this.mineralContent = mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 30 || getDaysToExpire() <= 20;
    }

    @Override
    public String toString() {
        return "Water (" + "Mineral Content: " + mineralContent + " mg) - " + super.toString();
    }
}
