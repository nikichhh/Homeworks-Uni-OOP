package bg.tu_varna.sit.b2.f23621689.homework6.task4;

public class Application {
    public static void main(String[] args) {
        Fish[] lakeFish = {
                new EdibleFish("Trout", 15, 60),
                new NonEdibleFish("Carp", 5, "Pollution")
        };

        Fish[] riverFish = {
                new EdibleFish("Salmon", 8, 50),
                new NonEdibleFish("Catfish", 12, "Overfishing")
        };

        Lake lake = new Lake("Great Lake", 6, lakeFish, 50, 30);
        River river = new River("Amazon", 4, riverFish, 25);

        System.out.println("Lake is floaty: " + lake.isFloaty());
        System.out.println("Lake is productable: " + lake.isProductable());
        System.out.println("Lake production: " + lake.calculateProduction());

        System.out.println("River is floaty: " + river.isFloaty());
        System.out.println("River is productable: " + river.isProductable());
        System.out.println("River production: " + river.calculateProduction());
    }
}
