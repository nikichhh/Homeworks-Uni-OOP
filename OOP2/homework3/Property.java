package bg.tu_varna.sit.b2.f23621689.homework3;

public class Property {
    private PropertyType type;
    private double area;
    private double price;
    private int rooms;
    private boolean furnished;
    private boolean hasGarage;
    private boolean hasGarden;

    protected Property(PropertyBuilder builder) {
        this.type = builder.type;
        this.area = builder.area;
        this.price = builder.price;
        this.rooms = builder.rooms;
        this.furnished = builder.furnished;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type + " - " + area + " sqm, " + price + " BGN, " + rooms + " rooms";
    }
}

