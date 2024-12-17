package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public class River extends WaterBody {
    private double speed;

    public River(String name, double depth, Fish[] fishes, double speed) {
        super(name, depth, fishes);
        this.speed = speed;
    }

    @Override
    public boolean isFloaty() {
        return getDepth() >= 3 && speed <= 30;
    }
}
