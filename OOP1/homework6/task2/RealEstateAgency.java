package bg.tu_varna.sit.b2.f23621689.homework6.task2;

public class RealEstateAgency {
    private String name;
    private Property[] properties;
    private int propertyCount;

    public RealEstateAgency(String name) {
        this.name = name;
        this.properties = new Property[100];
        this.propertyCount = 0;
    }

    public void addProperty(Property property) {
        if (propertyCount < properties.length) {
            properties[propertyCount++] = property;
        } else {
            System.out.println("Не може да се добавят повече имоти.");
        }
    }

    public double calculateTotalExpectedCommission() {
        double totalCommission = 0;
        for (int i = 0; i < propertyCount; i++) {
            totalCommission += properties[i].calculateCommission();
        }
        return totalCommission;
    }

    public int getPropertiesForSale() {
        int count = 0;
        for (int i = 0; i < propertyCount; i++) {
            if (!properties[i].isForRent()) {
                count++;
            }
        }
        return count;
    }
}
