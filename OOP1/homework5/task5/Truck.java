package bg.tu_varna.sit.b2.f23621689.homework5.task5;

public class Truck extends Automobile {
    private int capacity;
    private int elapsedTime;

    Truck(String brand, String model, int power, String engineType, String transmission, int yearOfManufacture, int capacity) {
        super(brand, model, power, engineType, transmission, yearOfManufacture);
        this.capacity = capacity;
        this.elapsedTime = 0;
    }

    public boolean startup() {
        return elapsedTime < 6;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}

