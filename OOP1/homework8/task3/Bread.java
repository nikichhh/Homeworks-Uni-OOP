package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Bread extends Item {
    private int whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, ItemType itemType, int whiteFlourPercentage) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, itemType);
        if (whiteFlourPercentage < 0 || whiteFlourPercentage > 100) {
            throw new InvalidDataException("Некоректен процент за бяло брашно!");
        }
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return super.needsDelivery() || (getDaysToExpire() <= 5 && whiteFlourPercentage > 75);
    }
}