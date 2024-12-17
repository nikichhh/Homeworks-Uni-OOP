package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, boolean isForRent, String propertyType, int numberOfFloors, boolean hasGarden) throws InvalidDataException {
        super(area, price, isForRent, propertyType);
        if (numberOfFloors <= 0) {
            throw new InvalidDataException("Некоректни данни за къща!");
        }
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    public double calculateCommission() {
        if (isForRent() && hasGarden) {
            return getPrice() * 0.08;
        } else if (!isForRent() && getArea() < 100) {
            return getPrice() * 0.05;
        } else {
            return getPrice() * 0.03;
        }
    }
}
