package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public abstract class Drink implements Delivery, Serving {
    private final String name;
    private int quantity;
    private final double serveQuantity;

    public Drink(String name, int quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getServeQuantity() {
        return serveQuantity;
    }

    @Override
    public boolean needDelivery() {
        return quantity < getMinimumStock();
    }

    @Override
    public void deliver(int deliveredQuantity) {
        quantity += deliveredQuantity;
    }

    @Override
    public void serve(int units) {
        double totalServeQuantity = units * serveQuantity;
        if (totalServeQuantity > quantity) {
            throw new IllegalArgumentException("Недостатъчно количество за сервиране!");
        }
        quantity -= totalServeQuantity;
    }

    protected abstract int getMinimumStock();

    @Override
    public String toString() {
        return "Напитка: " + name + ", Налично количество: " + quantity + " л, Необходимо ли е зареждане: " +
                (needDelivery() ? "Да" : "Не");
    }
}

