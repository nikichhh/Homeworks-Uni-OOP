package bg.tu_varna.sit.b2.f23621689.homework3.task4;

public class Ticket {
    protected String performanceName;
    protected double price;

    public Ticket(String performanceName, double price) {
        this.performanceName = performanceName;
        this.price = price;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public double getPrice() {
        return price;
    }
}
