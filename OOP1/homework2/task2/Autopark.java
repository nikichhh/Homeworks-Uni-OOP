package bg.tu_varna.sit.b2.f23621689.homework2.task2;

public class Autopark {
    Car[] cars;

    public Autopark(Car[] cars) {
        this.cars = cars;
    }

    public Car getCarWithMinMileage() {
        if (cars.length == 0) {
            return null;
        }
        Car minMileageCar = cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getMileage() < minMileageCar.getMileage()) {
                minMileageCar = cars[i];
            }
        }
        return minMileageCar;
    }
}
