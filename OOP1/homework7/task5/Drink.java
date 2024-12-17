package bg.tu_varna.sit.b2.f23621689.homework7.task5;

public abstract class Drink implements Delivery, Serving {
    private String name;
    private double quantity;
    private double serveQuantity;

    public Drink(String name, double quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getServeQuantity() {
        return serveQuantity;
    }

    @Override
    public void deliver(double deliveryQuantity) {
        this.quantity += deliveryQuantity;
    }

    @Override
    public void serve(int units) {
        double totalRequired = units * serveQuantity;
        if (quantity >= totalRequired) {
            quantity -= totalRequired;
            System.out.println(units + " units of " + name + " served.");
        } else {
            System.out.println("Not enough " + name + " available! Only " +
                    (int) (quantity / serveQuantity) + " units can be served.");
            quantity = 0;
        }
    }

    @Override
    public String toString() {
        return "Drink: " + name +
                ", Available quantity: " + String.format("%.2f", quantity) + " L" +
                ", Needs delivery: " + (needOfDelivery() ? "Yes" : "No");
    }
}
