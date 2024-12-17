package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class Shop extends Property {
    public Shop(double area, double price, boolean isForRent, String propertyType) throws InvalidDataException {
        super(area, price, isForRent, propertyType);
    }

    public double calculateCommission() {
        if (isForRent() && getArea() < 50) {
            return getPrice() * 0.02;
        } else if (!isForRent() && getArea() >= 100) {
            return getPrice() * 0.01;
        } else {
            return getPrice() * 0.06;
        }
    }
}
