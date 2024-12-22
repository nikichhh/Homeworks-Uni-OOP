package bg.tu_varna.sit.b2.f23621689.homework10.task3;

public class Car {
    private String brand;
    private String model;
    private Color color;
    private Fuel fuel;

    public Car(String brand, String model, Color color, Fuel fuel) throws InvalidDataException {
        if (brand == null || brand.isEmpty() || model == null || model.isEmpty() || color == null || fuel == null) {
            throw new InvalidDataException("Invalid car data!");
        }
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Fuel getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Model: %s, Color: %s, Fuel: %s", brand, model, color, fuel);
    }
}
