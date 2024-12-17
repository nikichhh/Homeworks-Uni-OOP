package bg.tu_varna.sit.b2.f23621689.homework5.task4;

abstract class Ticket {
    String performanceName;
    double price;

    Ticket(String performanceName, double price) {
        this.performanceName = performanceName;
        this.price = price;
    }

    abstract double getPrice();

    String getPerformanceName() {
        return performanceName;
    }

    double getBasePrice() {
        return price;
    }
}
