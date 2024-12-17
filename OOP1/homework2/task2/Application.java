package bg.tu_varna.sit.b2.f23621689.homework2.task2;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "CA1234AB", 50000);
        Car car2 = new Car("AUDI", "CB5678CD", 30000);
        Car car3 = new Car("Honda", "CC9876EF", 60000);

        Car[] cars = {car1, car2, car3};
        Autopark autopark = new Autopark(cars);
        Car carWithMinMileage = autopark.getCarWithMinMileage();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        if (carWithMinMileage != null) {
            System.out.println("Car with minimum mileage:");
            System.out.println("Brand: " + carWithMinMileage.getBrand());
            System.out.println("Registration Number: " + carWithMinMileage.getRegistrationNumber());
            System.out.println("Mileage: " + carWithMinMileage.getMileage());
        } else {
            System.out.println("No cars available.");
        }

    }
}
