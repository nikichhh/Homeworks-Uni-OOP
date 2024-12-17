package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public class EdibleFish extends Fish {
    private double percentOfYield;

    public EdibleFish(FishList name, double quantity, double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }

    public double getPercentOfYield() {
        return percentOfYield;
    }
}
