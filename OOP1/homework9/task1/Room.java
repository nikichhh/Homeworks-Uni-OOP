package bg.tu_varna.sit.b2.f23621689.homework9.task1;

public abstract class Room implements PriceCalculator {
    private double pricePerDay;
    private Exposure exposure;
    private boolean available;

    public double getPricePerDay() {
        return pricePerDay;
    }

    public Room(double pricePerDay, Exposure exposure) {
        this.pricePerDay = pricePerDay;
        this.exposure = exposure;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Exposure getExposure() {
        return exposure;
    }

    @Override
    public String toString() {
        return "Цена на нощувка: " + pricePerDay + ", Изложение: " + exposure + ", Свободна: " + available;
    }
}
