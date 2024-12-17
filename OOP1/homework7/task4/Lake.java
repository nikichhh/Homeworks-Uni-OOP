package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public class Lake extends WaterBody {
    private double width;
    private double length;

    public Lake(String name, double depth, Fish[] fishes, double width, double length) {
        super(name, depth, fishes);
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean isFloaty() {
        return getDepth() >= 5 && width * length >= 1000;
    }
}
