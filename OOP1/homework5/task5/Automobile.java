package bg.tu_varna.sit.b2.f23621689.homework5.task5;

public class Automobile {
    private String brand;
    private String model;
    private int color;
    private int power;
    private String engineType;
    private String transmission;
    private int yearOfManufacture;
    private int mileage;

    public Automobile(String brand, String model, int power, String engineType, String transmission, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = 0xCCCCCC;
        this.power = power;
        this.engineType = engineType;
        this.transmission = transmission;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = 0;
    }

    public boolean startup() {
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

