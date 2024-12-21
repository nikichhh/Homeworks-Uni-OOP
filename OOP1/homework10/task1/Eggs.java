package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public class Eggs extends Item {
    private int numberInPack;

    public Eggs(double itemPrice, int availableQuantity, int numberInPack) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.numberInPack = numberInPack;
    }

    public int getNumberInPack() {
        return numberInPack;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number in Pack: " + numberInPack;
    }
}
