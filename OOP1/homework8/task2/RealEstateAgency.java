package bg.tu_varna.sit.b2.f23621689.homework8.task2;

public class RealEstateAgency {
    private String name;
    private Property[] properties;
    private int count;

    public RealEstateAgency(String name, int capacity) {
        this.name = name;
        this.properties = new Property[capacity];
        this.count = 0;
    }

    public void addProperty(Property property) {
        if (count < properties.length) {
            properties[count++] = property;
        }
    }

    public double calculateTotalExpectedCommission() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += properties[i].calculateCommission();
        }
        return total;
    }

    public int getPropertiesForSale() {
        int forSaleCount = 0;
        for (int i = 0; i < count; i++) {
            if (!properties[i].isForRent()) {
                forSaleCount++;
            }
        }
        return forSaleCount;
    }

    public String toString() {
        String result = "Агенция за недвижими имоти: " + name + "\n";
        for (int i = 0; i < count; i++) {
            result += properties[i].getPropertyType() + " - Цена: " + properties[i].getPrice() + "\n";
        }
        return result;
    }
}
