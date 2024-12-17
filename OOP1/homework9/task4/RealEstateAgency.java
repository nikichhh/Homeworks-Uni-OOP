package bg.tu_varna.sit.b2.f23621689.homework9.task4;

public class RealEstateAgency {
    private Property[] properties;
    private int count;

    public RealEstateAgency(int capacity) {
        this.properties = new Property[capacity];
        this.count = 0;
    }

    public void addProperty(Property property) {
        if (count < properties.length) {
            properties[count++] = property;
        }
    }

    public double calculatePriceOfAllProperties() {
        double total = 0;

        for (Property property : properties) {
            if (property == null) {
                continue;
            }
            total += property.calculate();
        }

        return total;
    }

    public void sortPropertiesByArea() {
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (properties[j].getArea() < properties[minIndex].getArea()) {
                    minIndex = j;
                }
            }
            Property temp = properties[i];
            properties[i] = properties[minIndex];
            properties[minIndex] = temp;
        }
    }

    public Property getMostExpensiveApartment() {
        Property mostExpensive = null;

        for(Property property: properties) {
            if(property instanceof Apartment) {
                if (mostExpensive == null || property.calculate() > mostExpensive.calculate()) {
                    mostExpensive = property;
                }
            }
        }

        return mostExpensive;
    }

    public double calculateAverageHousePrice() {
        double total = 0;
        int houseCount = 0;

        for(Property property: properties) {
            if (property instanceof House) {
                total += property.calculate();
                houseCount++;
            }
        }

        return houseCount > 0 ? total / houseCount : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Недвижими имоти:\n");
        for (int i = 0; i < count; i++) {
            sb.append(properties[i]).append("\n");
        }
        return sb.toString();
    }
}
