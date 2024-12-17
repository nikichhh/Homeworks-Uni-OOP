package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Cheese extends Item {
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, ItemType itemType, int gramsPerPackage) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, itemType);
        if (gramsPerPackage <= 0) {
            throw new InvalidDataException("Некоректен грамаж на пакета!");
        }
        this.gramsPerPackage = gramsPerPackage;
    }
}