package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class Office extends Property {
    private int numberOfRooms;
    private boolean hasParkingLot;

    public Office(double area, double price, boolean isForRent, String propertyType, int numberOfRooms, boolean hasParkingLot) throws InvalidDataException {
        super(area, price, isForRent, propertyType);
        if (numberOfRooms <= 0) {
            throw new InvalidDataException("Некоректни данни за офис!");
        }
        this.numberOfRooms = numberOfRooms;
        this.hasParkingLot = hasParkingLot;
    }

    public double calculateCommission() {
        if (isForRent()) {
            return getPrice() * 0.18;
        } else if (hasParkingLot && numberOfRooms > 2) {
            return getPrice() * 0.15;
        } else {
            return getPrice() * 0.11;
        }
    }
}
