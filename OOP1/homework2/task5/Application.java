package bg.tu_varna.sit.b2.f23621689.homework2.task5;

public class Application {
    public static void main(String[] args) {
        SoftDrink drink1 = new SoftDrink("Coca-Cola", "2024-12-01", 15, 10.6);
        SoftDrink drink2 = new SoftDrink("Pepsi", "2024-11-01", 1, 11.0);
        SoftDrink drink3 = new SoftDrink("Coca-Cola", "2024-12-01", 15, 10.6);

        SoftDrink[] drinks = {drink1, drink2, drink3};
        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);

        SoftDrinkShelf shelf = new SoftDrinkShelf(drinks);

        SoftDrink mostFrequentDrink = shelf.getMostFrequentSoftDrink();
        System.out.println("Most frequent soft drink:");
        System.out.println(mostFrequentDrink);
    }
}
