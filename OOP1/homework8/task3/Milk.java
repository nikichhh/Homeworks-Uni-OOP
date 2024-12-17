package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Milk extends Item {
    private double fatPercentage;

    public Milk(String name, int daysToExpire, int availableQuantity, ItemType itemType, double fatPercentage) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, itemType);
        if (fatPercentage < 0) {
            throw new InvalidDataException("Некоректен процент мазнини!");
        }
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return super.needsDelivery() || (getDaysToExpire() <= 15 && fatPercentage > 2.0);
    }
}