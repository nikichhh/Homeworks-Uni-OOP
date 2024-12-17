package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public class Milk extends Item implements Drink{
    private double fatPercentage;

    public Milk(String name, int daysToExpire, int availableQuantity, double fatPercentage) {
        super(name, daysToExpire, availableQuantity);
        this.fatPercentage = fatPercentage;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() <= 15 && (getAvailableQuantity() < 10 || fatPercentage > 2);
    }
}
