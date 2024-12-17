package bg.tu_varna.sit.b2.f23621689.homework5.task2;

public class Application {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Horse horse = new Horse();
        Sheep sheep = new Sheep();

        System.out.println("Начална енергия на кравата: " + cow.getEnergy());
        cow.sleep();
        System.out.println("Енергия на кравата след сън: " + cow.getEnergy());
        cow.eat();
        System.out.println("Енергия на кравата след ядене: " + cow.getEnergy());
        cow.moving();
        System.out.println("Енергия на кравата след движение: " + cow.getEnergy());

        System.out.println("\nНачална енергия на коня: " + horse.getEnergy());
        horse.sleep();
        System.out.println("Енергия на коня след сън: " + horse.getEnergy());
        horse.eat();
        System.out.println("Енергия на коня след ядене: " + horse.getEnergy());
        horse.moving();
        System.out.println("Енергия на коня след движение: " + horse.getEnergy());

        System.out.println("\nНачална енергия на овцата: " + sheep.getEnergy());
        sheep.sleep();
        System.out.println("Енергия на овцата след сън: " + sheep.getEnergy());
        sheep.eat();
        System.out.println("Енергия на овцата след ядене: " + sheep.getEnergy());
        sheep.moving();
        System.out.println("Енергия на овцата след движение: " + sheep.getEnergy());
    }
}
