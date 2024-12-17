package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public class AlcoholicBeverage extends Drink {
    private final double alcoholPercentage;
    private final int minAge;
    private final boolean isProper;

    public AlcoholicBeverage(String name, int quantity, double serveQuantity, double alcoholPercentage, int minAge, boolean isProper) throws InvalidDataException {
        super(name, quantity, serveQuantity);

        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new InvalidDataException("Въведен е невалиден процент алкохол!");
        }

        if (minAge < 0 || minAge > 100) {
            throw new InvalidDataException("Въведена е невалидна възраст!");
        }

        this.alcoholPercentage = alcoholPercentage;
        this.minAge = minAge;
        this.isProper = isProper;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean isProper() {
        return isProper;
    }

    @Override
    protected int getMinimumStock() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Процент алкохол: " + alcoholPercentage + "%, Минимална възраст: " + minAge +
                ", Подходяща за консумация: " + (isProper ? "Да" : "Не");
    }
}

