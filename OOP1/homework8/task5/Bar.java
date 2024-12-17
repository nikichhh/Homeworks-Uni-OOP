package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public class Bar {
    private final Drink[] drinks;
    private int drinkCount;

    public Bar(int capacity) {
        this.drinks = new Drink[capacity];
        this.drinkCount = 0;
    }

    public void addDrink(Drink drink) {
        if (drinkCount >= drinks.length) {
            throw new IllegalStateException("Барът е пълен! Не може да добавите повече напитки.");
        }
        drinks[drinkCount++] = drink;
    }

    public int getItemCountDelivery() {
        int count = 0;
        for (int i = 0; i < drinkCount; i++) {
            if (drinks[i].needDelivery()) {
                count++;
            }
        }
        return count;
    }

    public double getAverageServeQuantity() {
        if (drinkCount == 0) return 0.0;

        double totalServeQuantity = 0.0;
        for (int i = 0; i < drinkCount; i++) {
            totalServeQuantity += drinks[i].getServeQuantity();
        }
        return totalServeQuantity / drinkCount;
    }

    public int getAvailableDrinksCount() {
        int count = 0;
        for (int i = 0; i < drinkCount; i++) {
            if (drinks[i].getQuantity() > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "Напитки в бара:\n";
        for (int i = 0; i < drinkCount; i++) {
            result += drinks[i] + "\n";
        }
        return result;
    }
}
