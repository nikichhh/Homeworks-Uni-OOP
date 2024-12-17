package bg.tu_varna.sit.b2.f23621689.homework6.task3;

public class Application {
    public static void main(String[] args) {
        Item[] items = {
                new Bread("Bread", 3, 8, 80),
                new Cheese("Cheese", 10, 5, 400),
                new Milk("Milk", 14, 9, 3.5),
                new Water("Water", 25, 40, 7.0)
        };

        Shop shop = new Shop(items);

        System.out.println("Items needing delivery: " + shop.getItemCountDelivery());
        System.out.println("Average days to expire: " + shop.getAverageDaysToExpire());
        System.out.println("Available drinks count: " + shop.getAvailableDrinksCount());
    }
}
