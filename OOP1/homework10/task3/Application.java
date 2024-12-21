package bg.tu_varna.sit.b2.f23621674.homework9.task3;

public class Application {
    public static void main(String[] args) {
        try {
            Register register = new Register(10);

            Person person1 = new Person("1234567890", "John", "Doe", 25);
            Person person2 = new Person("0987654321", "Jane", "Smith", 30);

            Car car1 = new Car("Toyota", "Corolla", Color.BLUE, Fuel.PETROL);
            Car car2 = new Car("Honda", "Civic", Color.RED, Fuel.DIESEL);
            Car car3 = new Car("Tesla", "Model S", Color.GRAY, Fuel.PHEV);

            Owner owner1 = new Owner(person1, 2);
            owner1.addCar(car1);
            owner1.addCar(car2);

            Owner owner2 = new Owner(person2, 1);
            owner2.addCar(car3);

            register.addRegistration(owner1);
            register.addRegistration(owner2);

            System.out.println("Register:");
            System.out.println(register);

            System.out.println("Find owner by EGN 1234567890:");
            System.out.println(register.findOwnerByEgn("1234567890"));

            System.out.println("Find car by registration (Brand: Honda, Model: Civic):");
            System.out.println(register.findCarByRegistration("Honda", "Civic"));

        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
