package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, boolean isForRent, int numberOfFloors, boolean hasGarden) {
        super(area, price, isForRent);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateCommission() {
        if (isForRent() && hasGarden) {
            return 0.08 * getPrice();
        } else if (!isForRent() && getArea() <= 100) {
            return 0.05 * getPrice();
        } else {
            return 0.03 * getPrice();
        }
    }
}
