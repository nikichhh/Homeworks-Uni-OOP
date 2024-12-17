package bg.tu_varna.sit.b2.f23621689.homework7.task4;

public class Application {
    public static void main(String[] args) {
        Fish[] fishes = {
                new EdibleFish(FishList.ESTER, 20, 50),
                new EdibleFish(FishList.CATFISH, 15, 40),
                new NonEdibleFish(FishList.PIRANHA, 10, "Dangerous predator")
        };

        WaterBody lake = new Lake("Lake Sofia", 6, fishes, 50, 30);
        WaterBody river = new River("River Danube", 4, fishes, 25);

        System.out.println("Lake is floaty: " + lake.isFloaty());
        System.out.println("Lake is productable: " + lake.isProductable());
        System.out.println("Lake production: " + lake.calculateProduction() + " tons");

        System.out.println("River is floaty: " + river.isFloaty());
        System.out.println("River is productable: " + river.isProductable());
        System.out.println("River production: " + river.calculateProduction() + " tons");
    }
}
