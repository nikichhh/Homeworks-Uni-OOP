package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public class Bread extends Item implements Food{
    private int whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, int whiteFlourPercentage) {
        super(name, daysToExpire, availableQuantity);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    public int getWhiteFlourPercentage() {
        return whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() < 5 || (getWhiteFlourPercentage() > 75 && getAvailableQuantity() < 10);
    }
}
