package bg.tu_varna.sit.b2.f23621689.homework9.task4;

public abstract class Property implements PriceCalculator {
    private double area;
    private double basePrice;
    private PropertyType propertyType;

    public Property(double area, double basePrice, PropertyType propertyType) {
        this.area = area;
        this.basePrice = basePrice;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    @Override
    public abstract double calculate();
}
