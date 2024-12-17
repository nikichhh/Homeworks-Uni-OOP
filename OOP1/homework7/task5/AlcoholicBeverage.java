package bg.tu_varna.sit.b2.f23621689.homework7.task5;

public class AlcoholicBeverage extends Drink {
    private double alcoholPercentage; // alcohol percentage

    public AlcoholicBeverage(String name, double quantity, double serveQuantity, double alcoholPercentage) {
        super(name, quantity, serveQuantity);
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public boolean isProper(int age) {
        if (age >= 18 && age <= 21) {
            return alcoholPercentage <= 10;
        }
        return age > 21;
    }

    @Override
    public boolean needOfDelivery() {
        return getQuantity() < 5;
    }
}
