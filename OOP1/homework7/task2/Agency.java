package bg.tu_varna.sit.b2.f23621689.homework7.task2;

public class Agency {
    private Property[] properties;
    private int count;

    public Agency(Property[] properties) {
        this.properties = properties;
        this.count = properties.length;
    }

    public double calculateTotalCommission() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += properties[i].calculateCommission();
        }
        return total;
    }

    public Property[] getPropertiesForSale() {
        Property[] forSale = new Property[count];
        int saleCount = 0;
        for (int i = 0; i < count; i++) {
            if (properties[i].getPropertyType() == PropertyType.SALE) {
                forSale[saleCount++] = properties[i];
            }
        }
        Property[] result = new Property[saleCount];
        System.arraycopy(forSale, 0, result, 0, saleCount);
        return result;
    }

    public void printProperties() {
        for (int i = 0; i < count; i++) {
            System.out.println(properties[i]);
        }
    }
}
