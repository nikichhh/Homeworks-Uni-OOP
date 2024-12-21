package bg.tu_varna.sit.b2.f23621689.homework10.task1;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop(10);

        shop.addItem(new Biscuits(2.5, 8));
        shop.addItem(new Bread(1.2, 15, "Whole Wheat"));
        shop.addItem(new Eggs(3.0, 12, 6));
        shop.addItem(new Water(0.8, 25, "Spring Water", "MINERAL"));

        System.out.println("Items in the shop:");
        System.out.println(shop);

        System.out.println("Total items for delivery: " + shop.countItemsForDelivery());
        System.out.println("Total price of all items: " + shop.calculateItemsPrice());
        System.out.println("Item with most available quantity: " + shop.getItemWithMostAvailableQuantity());
        System.out.println("Item type with least quantity: " + shop.getItemTypeWithLeastQuantity());
    }
}
