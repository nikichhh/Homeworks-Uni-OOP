package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public class Office extends Property {
    private boolean hasParkingLot;
    private int numberOfRooms;

    public Office(double area, double price, boolean isForRent, boolean hasParkingLot, int numberOfRooms) {
        super(area, price, isForRent);
        this.hasParkingLot = hasParkingLot;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double calculateCommission() {
        if (isForRent()) {
            return 0.18 * getPrice();
        } else if (hasParkingLot && numberOfRooms > 2) {
            return 0.15 * getPrice();
        } else {
            return 0.11 * getPrice();
        }
    }
}
