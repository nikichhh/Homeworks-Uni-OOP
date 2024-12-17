package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Cheese extends Item {
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, int gramsPerPackage) {
        super(name, daysToExpire, availableQuantity, ItemType.FOOD);
        this.gramsPerPackage = gramsPerPackage;
    }

    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 10 && gramsPerPackage >= 400;
    }

    @Override
    public String toString() {
        return "Cheese (" + "Grams per Package: " + gramsPerPackage + ") - " + super.toString();
    }
}
