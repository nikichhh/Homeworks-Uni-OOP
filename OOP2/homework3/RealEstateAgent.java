package bg.tu_varna.sit.b2.f23621689.homework3;

public class RealEstateAgent extends Agent implements CommissionCalculator, AgentActions {
    public RealEstateAgent(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void addProperty(Property property) throws PropertyException {
        propertyManager.addProperty(property);
        System.out.println(name + " added property: " + property);
    }

    @Override
    public void removeProperty(Property property) throws PropertyException {
        propertyManager.removeProperty(property);
        System.out.println(name + " removed property: " + property);
    }

    @Override
    public double calculateCommission(Property property) {
        return property.getPrice() * 0.03;
    }
}
