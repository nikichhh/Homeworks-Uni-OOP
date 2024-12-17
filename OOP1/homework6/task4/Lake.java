package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public class Lake extends WaterBody {
    private double width;
    private double length;

    public Lake(String name, double depth, Fish[] fishArray, double width, double length) {
        super(name, depth, fishArray);
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
        return getDepth() >= 5 && width * length >= 1000;
    }
}
