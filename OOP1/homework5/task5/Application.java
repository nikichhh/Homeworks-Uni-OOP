package bg.tu_varna.sit.b2.f23621689.homework5.task5;

public class Application {
    public static void main(String[] args) {
        Automobile car = new Automobile("Toyota", "Corolla", 120, "Бензин", "Автоматична", 2022);
        System.out.println("Автомобил: " + car.getBrand() + " " + car.getModel());
        System.out.println("Може ли автомобилът да стартира: " + car.startup());

        Truck truck = new Truck("Volvo", "FH16", 540, "Дизел", "Ръчна", 2020, 20000);
        System.out.println("\nКамион: " + truck.getBrand() + " " + truck.getModel());
        System.out.println("Товарен капацитет: " + truck.getCapacity() + " кг");
        truck.setElapsedTime(5);
        System.out.println("Може ли камионът да стартира: " + truck.startup());
        truck.setElapsedTime(7);
        System.out.println("Може ли камионът да стартира след 7 часа: " + truck.startup());

        Bus bus = new Bus("Mercedes", "Sprinter", 160, "Дизел", "Автоматична", 2019, 20);
        System.out.println("\nАвтобус: " + bus.getBrand() + " " + bus.getModel());
        System.out.println("Брой седящи места: " + bus.getSeats());

        for (int i = 0; i < 6; i++) {
            bus.incrementCourses();
        }

        System.out.println("Брой курсове: " + bus.getCourses());
        System.out.println("Превишен ли е лимитът на курсовете: " + bus.isLimitExceeded());
    }
}
