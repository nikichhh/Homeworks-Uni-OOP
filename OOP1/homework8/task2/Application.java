package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class Application {
    public static void main(String[] args) {
        try {
            Property apartment = new Apartment(70, 1000, true, "Апартамент", 3, 2);
            Property house = new House(150, 5000, false, "Къща", 2, true);
            Property office = new Office(90, 2000, true, "Офис", 3, true);
            Property shop = new Shop(40, 3000, false, "Магазин");

            RealEstateAgency agency = new RealEstateAgency("ИмотКонсулт", 10);
            agency.addProperty(apartment);
            agency.addProperty(house);
            agency.addProperty(office);
            agency.addProperty(shop);

            System.out.println(agency);
            System.out.println("Обща очаквана комисионна: " + agency.calculateTotalExpectedCommission());
            System.out.println("Брой имоти за продажба: " + agency.getPropertiesForSale());
        } catch (InvalidDataException e) {
            System.out.println("Грешка: " + e.getMessage());
        }
    }
}
