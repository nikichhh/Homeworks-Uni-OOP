package bg.tu_varna.sit.b2.f23621689.homework2.task1;

public class Item {
    String type;
    int quantity;
    double price;
    int expirationDays;

    public Item(String type, int quantity, double price, int expirationDays) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.expirationDays = expirationDays;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public void setExpirationDays(int expirationDays) {
        this.expirationDays = expirationDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return type + ", " + quantity + ", " + price + ", " + expirationDays;
    }
}
