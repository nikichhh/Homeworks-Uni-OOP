package bg.tu_varna.sit.b2.f23621689.homework5.task1;

public class City {
    private String name;
    private int postalCode;

    public City(String name, int postalCode) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return name + " (" + postalCode + ")";
    }
}
