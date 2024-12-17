package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public class SoftDrink extends Drink {
    private final boolean isSugarFree;
    private final Fragrance drinkFragrance;

    public SoftDrink(String name, int quantity, double serveQuantity, boolean isSugarFree, Fragrance drinkFragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        this.drinkFragrance = drinkFragrance;
    }

    @Override
    protected int getMinimumStock() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Без захар: " + (isSugarFree ? "Да" : "Не") + ", Аромат: " + drinkFragrance;
    }
}
