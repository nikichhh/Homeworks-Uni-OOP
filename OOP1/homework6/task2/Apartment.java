package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public class Apartment extends Property {
    private int numberOfRooms;
    private int floor;

    public Apartment(double area, double price, boolean isForRent, int numberOfRooms, int floor) {
        super(area, price, isForRent);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
    }

    @Override
    public double calculateCommission() {
        if (isForRent()) {
            return 0.15 * getPrice();
        } else if (getArea() <= 60) {
            return 0.10 * getPrice();
        } else {
            return 0.07 * getPrice();
        }
    }
}
