package bg.tu_varna.sit.b2.f23621689.homework9.task4;

public class Application {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency(10);

        Apartment a1 = new Apartment(80, 100000, PropertyType.NEW, 5, 3, Exposition.SOUTH, true);
        Apartment a2 = new Apartment(60, 80000, PropertyType.OLD, 2, 2, Exposition.NORTH, false);
        House h1 = new House(150, 150000, PropertyType.NEW, 2, true);
        House h2 = new House(120, 120000, PropertyType.OLD, 1, false);

        agency.addProperty(a1);
        agency.addProperty(a2);
        agency.addProperty(h1);
        agency.addProperty(h2);

        System.out.println(agency);
        System.out.println("Обща цена на имотите: " + agency.calculatePriceOfAllProperties());
        System.out.println("Средна цена на къщите: " + agency.calculateAverageHousePrice());
        System.out.println("Най-скъп апартамент: " + agency.getMostExpensiveApartment());

        agency.sortPropertiesByArea();
        System.out.println("Сортирани по площ:");
        System.out.println(agency);
    }
}
