package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public abstract class WaterBody implements Usage {
    private String name;
    private double depth;
    private Fish[] fishes;

    public WaterBody(String name, double depth, Fish[] fishes) {
        this.name = name;
        this.depth = depth;
        this.fishes = fishes;
    }

    public String getName() {
        return name;
    }

    public double getDepth() {
        return depth;
    }

    public Fish[] getFishes() {
        return fishes;
    }

    public abstract boolean isFloaty();

    public double calculateProduction() {
        double totalProduction = 0;
        for (Fish fish : fishes) {
            if (fish instanceof EdibleFish) {
                EdibleFish edibleFish = (EdibleFish) fish;
                totalProduction += (edibleFish.getQuantity() * edibleFish.getPercentOfYield() / 100);
            }
        }
        return totalProduction;
    }

    @Override
    public boolean isProductable() {
        return calculateProduction() > 10;
    }
}
