package bg.tu_varna.sit.b2.f23621689.homework8.task4;

public abstract class WaterBody implements IsProductable {
    private String name;
    private double depth;
    private double maxFishCapacity;

    public WaterBody(String name, double depth, double maxFishCapacity) {
        this.name = name;
        this.depth = depth;
        this.maxFishCapacity = maxFishCapacity;
    }

    public String getName() {
        return name;
    }

    public double getDepth() {
        return depth;
    }

    public double getMaxFishCapacity() {
        return maxFishCapacity;
    }

    public abstract boolean isFloaty();

    @Override
    public String toString() {
        return "Воден басейн {Име: '" + name + "', Дълбочина: " + depth + " м, Максимален рибен капацитет: " + maxFishCapacity + " тона}";
    }
}
