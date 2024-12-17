package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Bread extends Item {
    private double whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, double whiteFlourPercentage) {
        super(name, daysToExpire, availableQuantity, ItemType.FOOD);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() <= 5 || (whiteFlourPercentage > 75 && getAvailableQuantity() < 10);
    }

    @Override
    public String toString() {
        return "Bread (" + "White Flour: " + whiteFlourPercentage + "%) - " + super.toString();
    }
}
