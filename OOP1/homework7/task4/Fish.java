package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public abstract class Fish {
    private FishList name;
    private double quantity;

    public Fish(FishList name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public FishList getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
