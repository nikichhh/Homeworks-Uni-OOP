package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public abstract class Property implements Commission {
    private double area;
    private double price;
    private PropertyType propertyType;

    public Property(double area, double price, PropertyType propertyType) {
        this.area = area;
        this.price = price;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    @Override
    public String toString() {
        return "Type: " + propertyType + ", Area: " + area + " sq.m., Price: $" + price;
    }
}
