package bg.tu_varna.sit.b2.f23621689.homework6.task5;

public abstract class Drink implements Delivery, Serving {
    private String name;
    protected int quantity;
    private double literPerUnit;
    private double serveQuantity;

    public Drink(String name, int quantity, double literPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.literPerUnit = literPerUnit;
    }

    @Override
    public boolean needOfDelivery() {
        return this.quantity <= 5;
    }

    @Override
    public void deliver(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " units have been delivered for " + name + ". Total quantity: " + this.quantity);
    }

    @Override
    public void serve(int units) {
        double requiredLiters = units * literPerUnit;
        if (this.quantity >= units) {
            this.quantity -= units;
            System.out.println(units + " units of " + name + " have been served.");
        } else {
            System.out.println("Not enough " + name + " available. Current stock: " + this.quantity);
        }
    }

    @Override
    public String toString() {
        return "Drink: " + name + ", Available: " + quantity + ", Needs delivery: " + needOfDelivery();
    }
}
