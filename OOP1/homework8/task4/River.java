package bg.tu_varna.sit.b2.f23621689.homework8.task4;

public class River extends WaterBody {
    private double speed;

    public River(String name, double depth, double maxFishCapacity, double speed) throws WaterBodyException {
        super(name, depth, maxFishCapacity);
        if (depth <= 0 || speed <= 0) {
            throw new WaterBodyException("Дълбочината не може да бъде отрицателна величина");
        }
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean isFloaty() {
        return getDepth() >= 3.0 && speed <= 30.0;
    }

    @Override
    public double calculateProduction() {
        return getMaxFishCapacity() * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() + ", Скорост: " + speed + " км/ч";
    }
}