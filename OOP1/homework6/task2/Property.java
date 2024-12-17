package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public abstract class Property implements Commission {
    private double area;
    private double price;
    private boolean isForRent;

    public Property(double area, double price, boolean isForRent) {
        this.area = area;
        this.price = price;
        this.isForRent = isForRent;
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
}
