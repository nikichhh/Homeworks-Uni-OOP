package bg.tu_varna.sit.b2.f23621689.homework9.task4;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double basePrice, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, basePrice, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    @Override
    public double calculate() {
        double price = getBasePrice();

        if (hasGarden) {
            if (getPropertyType() == PropertyType.NEW && numberOfFloors >= 2) {
                return price * 1.20;
            }
            return price * 1.10;
        }
        return price * 1.07;
    }

    @Override
    public String toString() {
        return "Къща: Цена = " + calculate() + ", Етажи = " + numberOfFloors + ", Градина = " + hasGarden;
    }
}
