package bg.tu_varna.sit.b2.f23621689.homework7.task3;

public class Application {
    public static void main(String[] args) {
        Item bread = new Bread("Whole Grain Bread", 3, 8, 80);
        Item cheese = new Cheese("Cheddar", 30, 5, 500);
        Item milk = new Milk("Cow Milk", 10, 20, 3.5);
        Item water = new Water("Mineral Water", 25, 50, 150);

        Shop shop = new Shop(new Item[] {bread, cheese, milk, water});

        shop.printItems();
        System.out.println("Items needing delivery: " + shop.getItemCountDelivery());
        System.out.println("Average days to expire: " + shop.getAverageDaysToExpire());
        System.out.println("Available drinks count: " + shop.getAvailableDrinksCount());
    }
}
