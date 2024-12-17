package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Water extends Item {
    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, ItemType itemType, double mineralContent) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, itemType);
        if (mineralContent < 0) {
            throw new InvalidDataException("Некоректно съдържание на минерали!");
        }
        this.mineralContent = mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        return super.needsDelivery() || (getDaysToExpire() <= 20 && getAvailableQuantity() < 30);
    }
}