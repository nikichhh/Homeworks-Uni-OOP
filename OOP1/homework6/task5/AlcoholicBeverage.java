package bg.tu_varna.sit.b2.f23621689.homework6.task5;

public class AlcoholicBeverage extends Drink {
    private double alcoholVolume;

    public AlcoholicBeverage(String name, int quantity, double literPerUnit, double alcoholVolume) {
        super(name, quantity, literPerUnit);
        this.alcoholVolume = alcoholVolume;
    }

    @Override
    public boolean needOfDelivery() {
        return super.needOfDelivery() || this.quantity < 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alcohol content: " + alcoholVolume + "%";
    }
}
