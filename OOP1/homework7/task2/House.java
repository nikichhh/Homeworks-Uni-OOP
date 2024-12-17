package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, price, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT) {
            return getPrice() * 0.15;
        } else if (getPropertyType() == PropertyType.SALE) {
            if (hasGarden) {
                return getPrice() * 0.12;
            } else {
                return getPrice() * 0.09;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "House (" + numberOfFloors + " floors, Garden: " + hasGarden + ") - " + super.toString();
    }
}
