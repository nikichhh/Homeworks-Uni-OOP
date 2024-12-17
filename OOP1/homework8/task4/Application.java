package bg.tu_varna.sit.b2.f23621689.homework8.task4;

public class Application {
    public static void main(String[] args) {
        try {
            Lake lake = new Lake("Язовир Искър", 10, 20, 500, 1000);
            River river = new River("Река Дунав", 5, 15, 25);

            System.out.println(lake);
            System.out.println("Плавателен: " + (lake.isFloaty() ? "Да" : "Не"));
            System.out.println("Максимален добив: " + lake.calculateProduction() + " тона");

            System.out.println(river);
            System.out.println("Плавателен: " + (river.isFloaty() ? "Да" : "Не"));
            System.out.println("Максимален добив: " + river.calculateProduction() + " тона");
        } catch (WaterBodyException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
