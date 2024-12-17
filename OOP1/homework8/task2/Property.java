package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public abstract class Property implements Commission {
    private double area;
    private double price;
    private boolean isForRent;
    private String propertyType;

    public Property(double area, double price, boolean isForRent, String propertyType) throws InvalidDataException {
        if (area <= 0 || price <= 0 || propertyType == null || propertyType.isEmpty()) {
            throw new InvalidDataException("Некоректни данни за имота!");
        }
        this.area = area;
        this.price = price;
        this.isForRent = isForRent;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public boolean isForRent() {
        return isForRent;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public abstract double calculateCommission();
}
