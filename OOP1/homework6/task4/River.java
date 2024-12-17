package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public class River extends WaterBody {
    private double speed;

    public River(String name, double depth, Fish[] fishArray, double speed) {
        super(name, depth, fishArray);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean isFloaty() {
        return getDepth() >= 3 && speed <= 30;
    }
}
