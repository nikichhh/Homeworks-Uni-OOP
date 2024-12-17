package bg.tu_varna.sit.b2.f23621689.homework3.task5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 150, "Бензинов", "Автоматична", 2020, "Червен");
        System.out.println("Марка: " + car.getBrand() + ", Модел: " + car.getModel() + ", Километраж: " + car.getMileage() + " км");

        car.setColor("Син");
        car.setMileage(55000);
        System.out.println("Нов цвят на колата: " + car.getColor() + ", Нов километраж: " + car.getMileage() + " км");

        Truck truck = new Truck("Volvo", "FH16", 750, "Дизелов", "Ръчна", 2019, "Бял", 12000, 20);
        System.out.println("Товарен капацитет: " + truck.getLoadCapacity() + " тона, Време от стартиране на двигателя: " + truck.getElapsedTime() + " часа");

        if (truck.checkIfCanBeStarted()) {
            System.out.println("Камионът може да бъда стартиран.");
        } else {
            System.out.println("Камионът не може да се стартира. Повече от 6 часа са изминали от стартирането на двигателя.");
        }

        Bus bus = new Bus("Mercedes", "Sprinter", 200, "Дизелов", "Ръчна", 2018, 20, 5);
        System.out.println("Места в автобуса: " + bus.getNumberOfSeats() + ", Изминати курсове: " + bus.getCoursesTraveled());

        bus.incrementCourses();
        if (bus.isLimitExceeded()) {
            System.out.println("Ограничението за курсове на автобуса е надвишено.");
        } else {
            System.out.println("Ограничението за курсове не е надвишено.");
        }
    }
}