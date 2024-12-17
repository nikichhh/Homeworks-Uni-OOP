package bg.tu_varna.sit.b2.f23621689.homework2.task2;

public class Car {
    String brand;
    String registrationNumber;
    double mileage;

    public Car(String brand, String registrationNumber, double mileage) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getMileage() {
        return mileage;
    }
}
