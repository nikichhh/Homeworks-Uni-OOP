package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public class NonEdibleFish extends Fish {
    private String threat;

    public NonEdibleFish(String name, double quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }

    public String getThreat() {
        return threat;
    }
}
