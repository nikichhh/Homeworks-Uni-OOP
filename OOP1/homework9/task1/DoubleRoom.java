package bg.tu_varna.sit.b2.f23621689.homework9.task1;

public class DoubleRoom extends Room {
    private int days;
    private boolean hasChildren;

    public DoubleRoom(double pricePerDay, Exposure exposure, int days, boolean hasChildren) {
        super(pricePerDay, exposure);
        this.days = days;
        this.hasChildren = hasChildren;
    }

    @Override
    public double calculateStayPrice() {
        return (getPricePerDay() + 10) * days;
    }

    @Override
    public double calculateReservationPrice() {
        double totalPrice = calculateStayPrice();
        if (hasChildren && days > 5) {
            totalPrice *= 0.85;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Дни: " + days + ", С деца: " + hasChildren;
    }
}
