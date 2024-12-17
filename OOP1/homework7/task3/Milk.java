package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Milk extends Item {
    private double fatPercentage;

    public Milk(String name, int daysToExpire, int availableQuantity, double fatPercentage) {
        super(name, daysToExpire, availableQuantity, ItemType.FOOD);
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() <= 15 || (getAvailableQuantity() < 10 && fatPercentage > 2);
    }

    @Override
    public String toString() {
        return "Milk (" + "Fat: " + fatPercentage + "%) - " + super.toString();
    }
}
