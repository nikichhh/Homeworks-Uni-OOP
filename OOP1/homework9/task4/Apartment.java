package bg.tu_varna.sit.b2.f23621689.homework9.task4;

public class Apartment extends Property {
    private int floorNumber;
    private int numberOfRooms;
    private Exposition exposition;
    private boolean hasParking;

    public Apartment(double area, double basePrice, PropertyType propertyType, int floorNumber, int numberOfRooms, Exposition exposition, boolean hasParking) {
        super(area, basePrice, propertyType);
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.exposition = exposition;
        this.hasParking = hasParking;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public Exposition getExposition() {
        return exposition;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    @Override
    public double calculate() {
        double price = getBasePrice();

        if (getPropertyType() == PropertyType.NEW) {
            return price * 1.15;
        }
        price *= 1.18;

        if (hasParking) {
            price += getBasePrice() * 0.02;
        }

        return price;
    }

    @Override
    public String toString() {
        return "Апартамент: Цена = " + calculate() + ", Етаж = " + floorNumber + ", Стаи = " + numberOfRooms + ", Изложение = " + exposition + ", Паркомясто = " + hasParking;
    }
}
