package bg.tu_varna.sit.b2.f23621689.homework10.task3;

public class Owner {
    private Person person;
    private Car[] cars;
    private int carCount;

    public Owner(Person person, int capacity) {
        this.person = person;
        this.cars = new Car[capacity];
        this.carCount = 0;
    }

    public Person getPerson() {
        return person;
    }

    public boolean addCar(Car car) {
        if (carCount >= cars.length) {
            System.out.println("Owner has reached maximum car capacity.");
            return false;
        }
        cars[carCount++] = car;
        return true;
    }

    public Car[] getCars() {
        return cars;
    }

    public int getCarCount() {
        return carCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(person.toString()).append("\nCars:\n");
        for (int i = 0; i < carCount; i++) {
            sb.append(cars[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
