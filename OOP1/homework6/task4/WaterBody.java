package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public abstract class WaterBody implements Usage{
    private String name;
    private double depth;
    private Fish[] fishArray;

    public WaterBody(String name, double depth, Fish[] fishArray) {
        this.name = name;
        this.depth = depth;
        this.fishArray = fishArray;
    }

    public String getName() {
        return name;
    }

    public double getDepth() {
        return depth;
    }

    public Fish[] getFishArray() {
        return fishArray;
    }

    public abstract boolean isFloaty();

    @Override
    public boolean isProductable() {
        double totalEdibleFishQuantity = 0;
        for (Fish fish : fishArray) {
            if (fish instanceof EdibleFish) {
                totalEdibleFishQuantity += ((EdibleFish) fish).getQuantity();
            }
        }
        return totalEdibleFishQuantity >= 10;
    }

    public double calculateProduction() {
        double totalYield = 0;
        for (Fish fish : fishArray) {
            if (fish instanceof EdibleFish) {
                EdibleFish edibleFish = (EdibleFish) fish;
                totalYield += edibleFish.getQuantity() * (edibleFish.getPercentOfYield() / 100);
            }
        }
        return totalYield;
    }
}
