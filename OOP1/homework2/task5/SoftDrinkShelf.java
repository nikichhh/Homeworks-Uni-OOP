package bg.tu_varna.sit.b2.f23621689.homework2.task5;

public class SoftDrinkShelf {
    SoftDrink[] softDrinks;

    public SoftDrinkShelf(SoftDrink[] softDrinks) {
        this.softDrinks = softDrinks;
    }

    public SoftDrink getMostFrequentSoftDrink() {
        SoftDrink mostFrequent = null;
        int maxCount = 0;


        for (int i = 0; i < softDrinks.length; i++) {
            int count = 1;
            for (int j = i + 1; j < softDrinks.length; j++) {
                if (softDrinks[i].equals(softDrinks[j])) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                mostFrequent = softDrinks[i];
            }
        }
        return mostFrequent;
    }
}
