package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public class Water extends Item implements Drink{
    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, double mineralContent) {
        super(name, daysToExpire, availableQuantity);
        this.mineralContent = mineralContent;
    }

    public double getMineralContent() {
        return mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 30 || getDaysToExpire() < 20;
    }
}
