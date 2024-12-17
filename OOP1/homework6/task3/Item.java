package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public abstract class Item implements Delivery{
    private String name;
    private int daysToExpire;
    private int availableQuantity;

    public Item(String name, int daysToExpire, int availableQuantity) {
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    protected void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public abstract boolean needsDelivery();
}
