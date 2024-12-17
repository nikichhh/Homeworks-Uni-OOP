package bg.tu_varna.sit.b2.f23621689.homework3.task5;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private String engingeType;
    private String gearboxType;
    private int yearOfManifacture;
    private int mileage;

    public Car(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture, String color) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.engingeType = engingeType;
        this.gearboxType = gearboxType;
        this.yearOfManifacture = yearOfManifacture;
        this.color = color;
    }

    public Car(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.engingeType = engingeType;
        this.gearboxType = gearboxType;
        this.yearOfManifacture = yearOfManifacture;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getEngingeType() {
        return engingeType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public int getYearOfManifacture() {
        return yearOfManifacture;
    }

    public int getMileage() {
        return mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
