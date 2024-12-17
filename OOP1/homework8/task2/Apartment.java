package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class Apartment extends Property {
    private int numberOfRooms;
    private int floor;

    public Apartment(double area, double price, boolean isForRent, String propertyType, int numberOfRooms, int floor) throws InvalidDataException {
        super(area, price, isForRent, propertyType);
        if (numberOfRooms <= 0 || floor < 0) {
            throw new InvalidDataException("Некоректни данни за апартамент!");
        }
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
    }

    public double calculateCommission() {
        if (isForRent()) {
            return getPrice() * 0.15;
        } else if (getArea() >= 60) {
            return getPrice() * 0.10;
        } else {
            return getPrice() * 0.07;
        }
    }
}
