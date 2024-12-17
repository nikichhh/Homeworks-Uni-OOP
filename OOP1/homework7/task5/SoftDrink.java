package bg.tu_varna.sit.b2.f23621689.homework7.task5;

public class SoftDrink extends Drink {
    private boolean isSugarFree;
    private String flavor;

    public SoftDrink(String name, double quantity, double serveQuantity, boolean isSugarFree, String flavor) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        this.flavor = flavor;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public boolean needOfDelivery() {
        return getQuantity() < 10;
    }
}
