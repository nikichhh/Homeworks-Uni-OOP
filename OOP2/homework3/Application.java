package bg.tu_varna.sit.b2.f23621689.homework3;

public class Application {
    public static void main(String[] args) {
        try {
            RealEstateAgent agent1 = new RealEstateAgent("Nikolay Georgiev", "+359 882 761 103");
            RealEstateAgent agent2 = new RealEstateAgent("Petya Nacheva", "+359 887 625 221");

            Property house = new PropertyBuilder(PropertyType.HOUSE, 120.5, 250000)
                    .rooms(4)
                    .furnished(true)
                    .hasGarage(true)
                    .hasGarden(true)
                    .build();

            Property apartment = new PropertyBuilder(PropertyType.APARTMENT, 85.0, 150000)
                    .rooms(3)
                    .furnished(false)
                    .hasGarage(false)
                    .hasGarden(false)
                    .build();

            agent1.addProperty(house);
            agent2.addProperty(apartment);

            System.out.println("Properties in system: " + PropertyManager.getInstance().getProperties().size());

            System.out.println("\nCommissions:");
            System.out.println("Agent " + agent1.name + " commission: " + agent1.calculateCommission(house) + " BGN");
            System.out.println("Agent " + agent2.name + " commission: " + agent2.calculateCommission(apartment) + " BGN");

        } catch (PropertyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
