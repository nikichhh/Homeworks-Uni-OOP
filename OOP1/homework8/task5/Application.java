package bg.tu_varna.sit.b2.f23621689.homework8.task5;

public class Application {
    public static void main(String[] args) {
        try {
            Bar bar = new Bar(10);

            SoftDrink cola = new SoftDrink("Кока-Кола", 15, 0.5, false, Fragrance.COLA);
            SoftDrink lemonade = new SoftDrink("Лимонада", 8, 0.3, true, Fragrance.LEMON);

            AlcoholicBeverage whiskey = new AlcoholicBeverage("Уиски", 5, 0.2, 40.0, 18, true);
            AlcoholicBeverage vodka = new AlcoholicBeverage("Водка", 3, 0.1, 37.5, 21, true);

            bar.addDrink(cola);
            bar.addDrink(lemonade);
            bar.addDrink(whiskey);
            bar.addDrink(vodka);

            System.out.println(bar);

            System.out.println("Напитки, нуждаещи се от доставка: " + bar.getItemCountDelivery());
            System.out.println("Средно количество на порция: " + bar.getAverageServeQuantity());
            System.out.println("Налични напитки: " + bar.getAvailableDrinksCount());
        } catch (Exception e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
