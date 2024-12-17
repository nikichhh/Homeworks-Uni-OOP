package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public class Application {
    public static void main(String[] args) {
        Property apartment = new Apartment(75, 1000, PropertyType.RENT, 3, Parking.ONE_PLACE_FOR_RENT);
        Property house = new House(120, 250000, PropertyType.SALE, 2, true);
        Property office = new Office(150, 300000, PropertyType.SALE, Parking.TWO_PLACES_FOR_SALE);

        Agency agency = new Agency(new Property[] {apartment, house, office});

        agency.printProperties();
        System.out.println("Total Commission: " + agency.calculateTotalCommission());

        Property[] forSale = agency.getPropertiesForSale();
        System.out.println("Properties for Sale:");
        for (Property property : forSale) {
            System.out.println(property);
        }
    }
}
