package bg.tu_varna.sit.b2.f23621689.homework3.task5;

public class Truck extends Car{
    private double loadCapacity;
    private double elapsedTime;

    public Truck(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture, String color, double loadCapacity, double elapsedTime) {
        super(brand, model, power, engingeType, gearboxType, yearOfManifacture, color);
        this.loadCapacity = loadCapacity;
        this.elapsedTime = elapsedTime;
    }

    public Truck(String brand, String model, int power, String engingeType, String gearboxType, int yearOfManifacture, double loadCapacity, double elapsedTime) {
        super(brand, model, power, engingeType, gearboxType, yearOfManifacture);
        this.loadCapacity = loadCapacity;
        this.elapsedTime = elapsedTime;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public boolean checkIfCanBeStarted() {
        return elapsedTime < 6;
    }
}
