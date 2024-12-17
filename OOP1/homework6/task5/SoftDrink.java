package bg.tu_varna.sit.b2.f23621689.homework6.task5;

public class SoftDrink extends Drink {
    private boolean isSugarFree;

    public SoftDrink(String name, int quantity, double literPerUnit, boolean isSugarFree) {
        super(name, quantity, literPerUnit);
        this.isSugarFree = isSugarFree;
    }

    @Override
    public boolean needOfDelivery() {
        return super.needOfDelivery() || this.quantity < 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sugar-free: " + (isSugarFree ? "Yes" : "No");
    }
}
