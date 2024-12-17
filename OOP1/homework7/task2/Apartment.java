package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public class Apartment extends Property {
    private int numberOfRooms;
    private Parking parkingLot;

    public Apartment(double area, double price, PropertyType propertyType, int numberOfRooms, Parking parkingLot) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.parkingLot = parkingLot;
    }

    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.RENT) {
            return getPrice() * 0.15;
        } else if (getPropertyType() == PropertyType.SALE) {
            if (getArea() >= 60) {
                return getPrice() * 0.1;
            } else {
                return getPrice() * 0.07;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Apartment (" + numberOfRooms + " rooms, Parking: " + parkingLot + ") - " + super.toString();
    }
}
