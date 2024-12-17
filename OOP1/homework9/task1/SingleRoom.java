package bg.tu_varna.sit.b2.f23621689.homework9.task1;

public class SingleRoom extends Room {
    private int days;

    public SingleRoom(double pricePerDay, Exposure exposure, int days) {
        super(pricePerDay, exposure);
        this.days = days;
    }

    @Override
    public double calculateStayPrice() {
        return getPricePerDay() * days;
    }

    @Override
    public double calculateReservationPrice() {
        double totalPrice = calculateStayPrice();
        if (days > 3) {
            totalPrice *= 0.9;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Дни: " + days;
    }
}
