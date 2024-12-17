package bg.tu_varna.sit.b2.f23621689.homework2.task1;

public class Application {
    public static void main(String[] args) {
        Item item1 = new Item("Milk", 10, 1.50, 7);
        Item item2 = new Item("Bread", 20, 1.00, 3);
        Item item3 = new Item("Milk", 30, 0.2, 14);

        Item[] items = {item1, item2, item3};

        ItemArray itemArray = new ItemArray(items);

        double averagePrice = itemArray.calculateAverage();
        System.out.println(averagePrice);
    }
}
