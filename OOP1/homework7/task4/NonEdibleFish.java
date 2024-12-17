package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public class NonEdibleFish extends Fish {
    private String threat;

    public NonEdibleFish(FishList name, double quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }

    public String getThreat() {
        return threat;
    }
}
