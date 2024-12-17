package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public class Application {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency("Dream Homes");

        Property apartment = new Apartment(70, 120000, false, 3, 5);
        Property house = new House(150, 250000, true, 2, true);
        Property office = new Office(200, 500000, false, true, 4);
        Property shop = new Shop(80, 300000, true);

        agency.addProperty(apartment);
        agency.addProperty(house);
        agency.addProperty(office);
        agency.addProperty(shop);

        System.out.println("Обща комисионна: " + agency.calculateTotalExpectedCommission());
        System.out.println("Имотите за продажба: " + agency.getPropertiesForSale());
    }
}
