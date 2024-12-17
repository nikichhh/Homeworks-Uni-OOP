package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public class Office extends Property {
    private Parking parkingLot;

    public Office(double area, double price, PropertyType propertyType, Parking parkingLot) {
        super(area, price, propertyType);
        this.parkingLot = parkingLot;
    }

    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT) {
            return getPrice() * 0.18;
        } else if (getPropertyType() == PropertyType.SALE) {
            if (getArea() >= 100) {
                return getPrice() * 0.2;
            } else {
                return getPrice() * 0.1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Office (Parking: " + parkingLot + ") - " + super.toString();
    }
}
