package bg.tu_varna.sit.b2.f23621689.homework5.task4;

public class StandardTicket extends Ticket {
    boolean valid;

    StandardTicket(String performanceName, double price) {
        super(performanceName, price);
        this.valid = true;
    }

    double getPrice() {
        return price;
    }

    boolean isValid() {
        return valid;
    }

    void useTicket() {
        valid = false;
    }
}
