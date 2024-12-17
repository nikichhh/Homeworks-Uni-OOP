package bg.tu_varna.sit.b2.f23621689.homework8.task4;

public class Lake extends WaterBody {
    private double width;
    private double length;

    public Lake(String name, double depth, double maxFishCapacity, double width, double length) throws WaterBodyException {
        super(name, depth, maxFishCapacity);
        if (depth <= 0) {
            throw new WaterBodyException("Дълбочината не може да бъде отрицателна величина");
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean isFloaty() {
        return getDepth() >= 5.0 && width >= 1000.0 && length >= 1000.0;
    }

    @Override
    public double calculateProduction() {
        return getMaxFishCapacity();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ширина: " + width + " м, Дължина: " + length + " м";
    }
}
