package bg.tu_varna.sit.b2.f23621689.homework3;

public class PropertyBuilder {
    protected PropertyType type;
    protected double area;
    protected double price;
    protected int rooms;
    protected boolean furnished;
    protected boolean hasGarage;
    protected boolean hasGarden;

    public PropertyBuilder(PropertyType type, double area, double price) {
        this.type = type;
        this.area = area;
        this.price = price;
    }

    public PropertyBuilder rooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public PropertyBuilder furnished(boolean furnished) {
        this.furnished = furnished;
        return this;
    }

    public PropertyBuilder hasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public PropertyBuilder hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public Property build() {
        return new Property(this);
    }
}
