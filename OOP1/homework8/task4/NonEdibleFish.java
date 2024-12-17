package bg.tu_varna.sit.b2.f23621689.homework8.task4;

public class NonEdibleFish extends Fish {
    private boolean isThreatened;

    public NonEdibleFish(String name, double quantity, boolean isThreatened) {
        super(name, quantity);
        this.isThreatened = isThreatened;
    }

    public boolean isThreatened() {
        return isThreatened;
    }

    @Override
    public String toString() {
        return super.toString() + ", Застрашен: " + (isThreatened ? "Да" : "Не");
    }
}