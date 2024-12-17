package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public abstract class Fish {
    private String name;
    private double quantity;

    public Fish(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }
}
