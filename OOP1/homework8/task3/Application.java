package bg.tu_varna.sit.b2.f23621689.homework8.task3;

public class Application {
    public static void main(String[] args) {
        try {
            Item bread = new Bread("Хляб", 3, 8, ItemType.FOOD, 80);
            Item cheese = new Cheese("Сирене", 30, 12, ItemType.FOOD, 400);
            Item milk = new Milk("Мляко", 10, 9, ItemType.DRINK, 3.5);
            Item water = new Water("Минерална вода", 15, 5, ItemType.DRINK, 10.0);

            Shop shop = new Shop("Моят магазин", 10);
            shop.addItem(bread);
            shop.addItem(cheese);
            shop.addItem(milk);
            shop.addItem(water);

            System.out.println(shop);
            System.out.println("Брой артикули, нуждаещи се от доставка: " + shop.getItemCountDelivery());
            System.out.println("Среден срок на годност: " + shop.getAverageDaysToExpire());
            System.out.println("Налични напитки: " + shop.getAvailableDrinksCount());
        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
